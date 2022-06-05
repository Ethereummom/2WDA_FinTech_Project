# -*- coding: utf-8 -*-
"""
Created on Sun May 22 17:10:27 2022

@author: sangh
"""

import FinanceDataReader as fdr
import pandas as pds
import datetime

#시간 설정
realtime = datetime.datetime.now()
sysdate = realtime.date()

#FRED데이터
m2 = fdr.DataReader('M2', data_source='fred')
print(m2)


#가격 그래프화하기
m2['M2'].plot()
# m2.to_excel('M2 analysis.xlsx')