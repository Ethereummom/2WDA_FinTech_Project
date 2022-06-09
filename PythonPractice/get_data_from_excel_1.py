# -*- coding: utf-8 -*-
"""
Created on Wed May 25 00:54:25 2022

@author: sangh
"""

import FinanceDataReader as fdr
import pandas as pds

dataframe = pds.read_excel('C:\\Users\\sangh\\OneDrive\\바탕 화면\\신매매일지\\csvdata\\transactionhistory20220524.xlsx')
#경로에 있는 엑셀파일 가져와보기 여기서 파일 이름에 주의해야함
#파일 이름에 공백이나 - 같은 특문이 있으면 읽혀지지 않음.
print(dataframe)
#가져온 엑셀 데이터프레임을 출력해보기

#나의 잔고를 plot으로 그래프화해보기
dataframe['walletBalance'].plot()