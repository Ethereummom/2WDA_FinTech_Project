# -*- coding: utf-8 -*-
"""
Created on Sun May 22 15:39:53 2022

@author: sangh
"""

import FinanceDataReader as fdr
import pandas as pds

#KOSPI Index 2015~now
ks11 = fdr.DataReader('KS11', '2021-05-22')
print(ks11)

print(type(ks11))

btc = fdr.DataReader('BTC/USD', '2022-05-01')

print(btc)
btc['Low'].plot()

