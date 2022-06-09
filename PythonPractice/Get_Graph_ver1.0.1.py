# -*- coding: utf-8 -*-
"""
Created on Wed Jun  1 12:59:45 2022

@author: sangh
"""

import FinanceDataReader as fdr
import pandas as pd
import matplotlib.pyplot as plt
import datetime
import sys

#주식 정보 가져오기
df_krx = fdr.StockListing('KRX')
df_krx.to_csv('stockList.csv', mode ='w', encoding='utf-8-sig')

#이름으로 코드 찾기

def codeFromName(name):
    nameList = list(df_krx['Name'])
    return df_krx['Symbol'][nameList.index(name)]

#timeframe설정

dayBfNum = 1000
strToday = (datetime.datetime.today()).strftime("%Y%m%d")
strFromDay = (datetime.datetime.today() - datetime.timedelta(dayBfNum)).strftime("%Y%m%d")
strShowFromDay = (datetime.datetime.today()-datetime.timedelta(365)).strftime("%Y%m%d")




try:
    #만든 timeframe을 기반으로 가격 정보 가져오기
    strCode = codeFromName("ARIRANG 코스피")
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
    
    #그래프 만들기 https://yeko90.tistory.com/entry/matplotlib-%EA%B8%B0%EC%B4%88-subplot2grid%EB%A5%BC-%ED%99%9C%EC%9A%A9%ED%95%9C-%EC%BB%A4%EC%8A%A4%ED%84%B0%EB%A7%88%EC%9D%B4%EC%A7%95
    fig = plt.figure(figsize=(16, 14))
    top_axes = plt.subplot2grid((4,4), (0,0), rowspan=3, colspan=4)
    bottom_axes = plt.subplot2grid((4,4), (3,0), rowspan=1, colspan=4)
    
    top_axes.plot(chart.index, chart['20일'], label='MA20' , color='brown'  , linewidth= 1.5)
    top_axes.plot(chart.index,chart['120일'], label='MA120', color='skyblue', linewidth= 1.5)
    
    top_axes.plot(chart.index,chart['Close'],linewidth= 1)

    top_axes.bar(chart.index, height=chart['Close']-chart['Open'], bottom=chart['Open'], width=1, color=list(map(lambda c: 'red' if c>0 else 'blue', chart['Change'] )))
    top_axes.vlines(chart.index, chart['Low'],chart['High'], color=list(map(lambda c: 'red' if c>0 else 'blue', chart['Change'] )))
    
    bottom_axes.bar(df_date, df['Volume'])

    #화면에 보여주기
    plt.show()

    #파일로 저장하기
    plt.savefig(fname=f'{strToday}_{strCode}.png', bbox_inches='tight', pad_inches=0)

except:
    print('종목 이름을 재입력하시오')







    

