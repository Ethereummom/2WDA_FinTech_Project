from PyQt5.QtWidgets import *
from PyQt5.uic import loadUi
from PyQt5.QtGui import *
import FinanceDataReader as fdr
import pandas as pd
import matplotlib.pyplot as plt
import datetime
import sys

class MatplotlibWidget(QMainWindow):

    def __init__(self):
        QMainWindow.__init__(self)
        loadUi("default.ui", self)
        self.setWindowTitle("주식 코인 지수분석기")
        self.setWindowIcon(QIcon("icon.png"))
        self.btc.clicked.connect(self.update_graph)
        self.eth.clicked.connect(self.update_graph)

    def update_graph(self):
        #주식 정보 가져오기
        df_krx = fdr.StockListing('KRX')
        df_krx.to_csv('stockList.csv', mode ='w', encoding='utf-8-sig')

        #이름으로 코드 찾기

        def codeFromName(name):
            nameList = list(df_krx['BTC/USD'])
            return df_krx['Symbol'][nameList.index(name)]

        #timeframe설정

        dayBfNum = 1000
        strToday = (datetime.datetime.today()).strftime("%Y%m%d")
        strFromDay = (datetime.datetime.today() - datetime.timedelta(dayBfNum)).strftime("%Y%m%d")
        strShowFromDay = (datetime.datetime.today()-datetime.timedelta(365)).strftime("%Y%m%d")

        #만든 timeframe을 기반으로 가격 정보 가져오기
        strCode = codeFromName('NAVER')
        df = fdr.DataReader(strCode,strFromDay,strToday)
            
        #해당 데이터프레임을 엑셀화하기
        df.to_csv('stoceDtlList.csv',mode = 'w', encoding= 'utf-8-sig')
            
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