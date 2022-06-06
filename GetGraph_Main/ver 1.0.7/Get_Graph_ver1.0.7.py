from PyQt5.QtWidgets import *
from PyQt5.uic import loadUi
from PyQt5.QtGui import *
from PyQt5.QtCore import *
import FinanceDataReader as fdr
import pandas as pd
import matplotlib.pyplot as plt
import datetime
import sys
import pykorbit
import requests
from bs4 import BeautifulSoup

def data_based_analysis():
    technical_analysis_score = 0
    realtime = datetime.datetime.now()
    sysdate = realtime.date()

    #M2 본원통화량(광의통화)
    m2 = fdr.DataReader(['M2SL'], start='2017', end=sysdate, data_source='fred')

    now = m2.iloc[(len(m2)-1),0]
    b = m2.iloc[(len(m2)-2),0]
    c = m2.iloc[(len(m2)-3),0]
    d = m2.iloc[(len(m2)-4),0]
    e = m2.iloc[(len(m2)-5),0]
    f = m2.iloc[(len(m2)-6),0]
    fivemonthsaverage = (b+c+d+e+f)/5

    if now > fivemonthsaverage:
        technical_analysis_score = technical_analysis_score + 50

    #하이일드 채권 스프레드

    highyield_spread = fdr.DataReader(['BAMLH0A0HYM2'], start=sysdate-datetime.timedelta(10), end=sysdate, data_source='fred')
    nas = fdr.DataReader(['NASDAQCOM'], data_source='fred',start=sysdate-datetime.timedelta(5))
    nasdaq = nas.mean().iloc[0]
    #highyield_spread_30d_average_df = highyield_spread.loc[len(highyield_spread)-31:len(highyield_spread)-1,[0]] // for next version...
    #highyield_spread_30d_real_average = highyield_spread_30d_average_df.mean() // as same as line 34..
    #하이일드 채권 스프레드는 선행성 지표이며 가장 먼저 위험에 예민하게 반응하는 지표이다.

    highyield_spread_fullaverage = highyield_spread.mean().iloc[0]
    riskmanagement = nasdaq / highyield_spread_fullaverage
    if (riskmanagement < 205):
        technical_analysis_score = technical_analysis_score - 100
        if(riskmanagement < 100):
            technical_analysis_score = technical_analysis_score - 100
    
    #이동평균선 strategy 현재 가격이 지난 120일동안의 가격 평균보다 위쪽에 있을 때
    nasavg = fdr.DataReader(['NASDAQCOM'], data_source='fred',start=sysdate-datetime.timedelta(120))
    nasavg2 = nasavg.mean().iloc[0]
    naspresent = nasavg.iloc[len(nasavg)-1,0]

    if (naspresent > nasavg2):
        technical_analysis_score = technical_analysis_score + 50
        if(naspresent > nasavg2 + (nasavg2*0.618)):
            technical_analysis_score = technical_analysis_score + 30
    else:
        technical_analysis_score = technical_analysis_score - 30
        if(naspresent < nasavg2 + (nasavg2*0.618)):
            technical_analysis_score = technical_analysis_score + 20
            #과매도구간에 대한 식

    #print(m2)
    #highyield_spread.to_csv('highyield',mode = 'w', encoding= 'utf-8-sig')
    return technical_analysis_score

class MatplotlibWidget(QMainWindow):
    subject='subject'
    today = datetime.datetime.now()
    sam_url = "https://finance.naver.com/item/sise.naver?code=005930"
    sam_html = requests.get(sam_url).text
    sam_soup = BeautifulSoup(sam_html,"html5lib")
    sam_tags = sam_soup.select("#_nowVal")
    sam_tag = sam_tags[0]
    nas_url = "https://finance.naver.com/world/sise.naver?symbol=NAS@IXIC"
    nas_html = requests.get(nas_url).text
    nas_soup = BeautifulSoup(nas_html,"html5lib")
    nas_tags = nas_soup.select("#dayTable > tbody > tr:nth-child(1) > td.tb_td4 > span")
    nas_tag = nas_tags[0]
    sp_url = "https://finance.naver.com/world/sise.naver?symbol=SPI@SPX"
    sp_html = requests.get(sp_url).text
    sp_soup = BeautifulSoup(sp_html,"html5lib")
    sp_tags = sp_soup.select("#dayTable > tbody > tr:nth-child(1) > td.tb_td4 > span")
    sp_tag = sp_tags[0]
    kos_url = "https://finance.naver.com/sise/sise_index.naver?code=KOSPI"
    kos_html = requests.get(kos_url).text
    kos_soup = BeautifulSoup(kos_html,"html5lib")
    kos_tags = kos_soup.select("#now_value")
    kos_tag = kos_tags[0]
    gold_url = "http://www.kumsise.com/"
    gold_html = requests.get(gold_url).text
    gold_soup = BeautifulSoup(gold_html,"html5lib")
    gold_tags = gold_soup.select("#korea_sise_new > table > tbody > tr:nth-child(1) > td:nth-child(3) > span")
    gold_tag = gold_tags[0]

    def __init__(self):
        QMainWindow.__init__(self)
        loadUi("default.ui", self)
        self.setWindowTitle("주식 코인 지수분석기")
        self.setWindowIcon(QIcon("icon.png"))
        if (data_based_analysis()>=70):
            self.lineEdit_11.setStyleSheet("color: green")
            self.lineEdit_11.setText('매수시기가 적절합니다!')
        elif (data_based_analysis()>20) :
            self.lineEdit_11.setStyleSheet("color: orange")
            self.lineEdit_11.setText('진입하기 애매합니다.')
        else :
            self.lineEdit_11.setStyleSheet("color: red")
            self.lineEdit_11.setText('매수시기가 아닙니다!')
        
        self.btc.clicked.connect(self.setbtc)
        self.btc.clicked.connect(self.update_graph)
        self.eth.clicked.connect(self.seteth)
        self.eth.clicked.connect(self.update_graph)
        self.xrp.clicked.connect(self.setxrp)
        self.xrp.clicked.connect(self.update_graph)
        self.sam.clicked.connect(self.setsam)
        self.sam.clicked.connect(self.update_graph)
        self.nas.clicked.connect(self.setnas)
        self.nas.clicked.connect(self.update_graph)
        self.sp.clicked.connect(self.setsp)
        self.sp.clicked.connect(self.update_graph)
        self.kos.clicked.connect(self.setkos)
        self.kos.clicked.connect(self.update_graph)
        self.gold.clicked.connect(self.setgold)
        self.gold.clicked.connect(self.update_graph)
        self.timer = QTimer(self)
        self.timer.start(1000)
        self.timer.timeout.connect(self.inquiry)

    def inquiry(self):
        btc_price = pykorbit.get_current_price("BTC")
        self.lineEdit_1.setText(str(btc_price))
        eth_price = pykorbit.get_current_price("ETH")
        self.lineEdit_2.setText(str(eth_price))
        xrp_price = pykorbit.get_current_price("XRP")
        self.lineEdit_3.setText(str(xrp_price))
        self.lineEdit_4.setText(self.sam_tag.text)
        self.lineEdit_5.setText(self.nas_tag.text)
        self.lineEdit_6.setText(self.sp_tag.text)
        self.lineEdit_7.setText(self.kos_tag.text)
        self.lineEdit_8.setText(self.gold_tag.text)
        cur_time = QTime.currentTime()
        str_time = cur_time.toString("hh:mm:ss")
        self.lineEdit_9.setText(str_time)
        self.lineEdit_10.setText(str(self.today.date()))

    def setbtc(self):
        self.subject='BTC/KRW'

    def seteth(self):
        self.subject='ETH/KRW'

    def setxrp(self):
        self.subject='XRP/KRW'

    def setsam(self):
        self.subject='005930'

    def setnas(self):
        self.subject='IXIC'

    def setsp(self):
        self.subject='US500'

    def setkos(self):
        self.subject='KS11'

    def setgold(self):
        self.subject='GOLD'

    def update_graph(self):
        #주식 정보 가져오기
        df_krx = fdr.StockListing('KRX')
        df_krx.to_csv('stockList.csv', mode ='w', encoding='utf-8-sig')

        #이름으로 코드 찾기

        #def codeFromName(name):
        #    nameList = list(df_krx['Name'])
        #    return df_krx['Symbol'][nameList.index(name)]

        #timeframe설정

        dayBfNum = 1000
        strToday = (datetime.datetime.today()).strftime("%Y%m%d")
        strFromDay = (datetime.datetime.today() - datetime.timedelta(dayBfNum)).strftime("%Y%m%d")
        strShowFromDay = (datetime.datetime.today()-datetime.timedelta(365)).strftime("%Y%m%d")

        #만든 timeframe을 기반으로 가격 정보 가져오기
        #strCode = codeFromName('삼성전자')
        df = fdr.DataReader(self.subject,strFromDay,strToday)
            
        #해당 데이터프레임을 엑셀삼성화하기
        #df.to_csv('stoceDtlList.csv',mode = 'w', encoding= 'utf-8-sig')
            
        #이동평균선
        ma20 = pd.DataFrame(df['Close'].rolling(window=20).mean())
        ma120 = pd.DataFrame(df['Close'].rolling(window=120).mean())
            
        df.insert(len(df.columns), '20일' , ma20)
        df.insert(len(df.columns), '120일' , ma120)
            
        # 날짜로 필터
        df = df[(df.index >= strShowFromDay)] # 이평선이 중간부터 표시되는게 싫어서, 앞부분 필터
        chart = df

        DateList = list(df.index )
        VolumeList = list(df['Volume'])
        CloseList = list(df['Close'])

        # 날짜 공백 처리하기
        df_date = pd.to_datetime(DateList)
        #df_date = df_date.strftime(' %m/%d ')

        fig = plt.figure(figsize=(16, 14))
        top_axes = plt.subplot2grid((4,4), (0,0), rowspan=3, colspan=4)
        bottom_axes = plt.subplot2grid((4,4), (3,0), rowspan=1, colspan=4)   
        top_axes.plot(chart.index, chart['20일'], label='MA20' , color='brown'  , linewidth= 1)
        top_axes.plot(chart.index,chart['120일'], label='MA120', color='skyblue', linewidth= 1)
            
        top_axes.plot(chart.index,chart['Close'],linewidth= 1)

        top_axes.bar(chart.index, height=chart['Close']-chart['Open'], bottom=chart['Open'], width=1, color=list(map(lambda c: 'red' if c>0 else 'blue', chart['Change'] )))
        top_axes.vlines(chart.index, chart['Low'],chart['High'], color=list(map(lambda c: 'red' if c>0 else 'blue', chart['Change'] )))
            
        bottom_axes.bar(df_date, df['Volume'])
        plt.show()

app = QApplication([])
window = MatplotlibWidget()
window.show()
app.exec_()