import FinanceDataReader as fdr
import pandas as pds
import datetime
import matplotlib.pyplot as plt
###기술적분석기초 수치화된 데이터로 만들어서 적절한 투자시기를 정해보자
technical_analysis = 0

realtime = datetime.datetime.now()
sysdate = realtime.date()

m2 = fdr.DataReader(['M2SL'], start='2017', end=sysdate, data_source='fred')
now = m2.iloc[(len(m2)-1),0]

b = m2.iloc[(len(m2)-2),0]
c = m2.iloc[(len(m2)-3),0]
d = m2.iloc[(len(m2)-4),0]
e = m2.iloc[(len(m2)-5),0]
f = m2.iloc[(len(m2)-6),0]

#average1 = m2['M2SL']
#average = m2.tail()/5
#m2.info()
if now > (b+c+d+e+f)/5:
    technical_analysis = technical_analysis + 30



#print(m2)
print(now)
print(b)
print(c)
print(d)
print(e)
print(f)
print(technical_analysis)
print(len(m2))