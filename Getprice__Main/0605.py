import FinanceDataReader as fdr
from numpy import double
import pandas as pds
import datetime
import matplotlib.pyplot as plt
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
  
    print(technical_analysis_score)

data_based_analysis()    
   