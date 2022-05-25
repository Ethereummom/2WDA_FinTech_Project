import FinanceDataReader as fdr
import pandas as pd

df_krx = fdr.StockListing('KRX')

print(df_krx)
print(type(df_krx))