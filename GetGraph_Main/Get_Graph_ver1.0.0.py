# -*- coding: utf-8 -*-
"""
Created on Sun May 22 15:39:53 2022

@author: sangh
"""

import FinanceDataReader as fdr
import pandas as pds
import datetime

#시간 설정
realtime = datetime.datetime.now()
sysdate = realtime.date()

#금일 KOSPI Index 출력
ks11 = fdr.DataReader('KS11', sysdate)
print(ks11)

#금일 환율 출력
usdkrw = fdr.DataReader('USD/KRW', sysdate)
print(usdkrw)

#금일 금 가격 출력
gold = fdr.DataReader('ZG', sysdate)
print(gold)

#금일 비트코인 가격정보 출력 방법 1.DataReader사용하기
btc = fdr.DataReader('BTC/USD', sysdate)
print(btc)

#FRED데이터
m2 = fdr.DataReader('M2', data_source='fred')
print(m2)


#가격 그래프화하기
btc['High'].plot()
