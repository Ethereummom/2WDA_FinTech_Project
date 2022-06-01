import matplotlib.pyplot as plt
import pandas as pd
from numpy.random import randn as rd

ndf = pd.read_excel("C:\\Users\\tkdrm\\OneDrive\\문서\\GitHub\\2WDA_FinTech_Project\\weatherinfodaegu.xlsx")
ndf.set_index("최고기온일자", inplace=True)

plt.plot(ndf['평균최고기온(℃)'])
plt.plot(ndf['평균기온(℃)'])
plt.plot(ndf['평균최저기온(℃)'])
plt.show()

df = pd.read_excel("C:\\Users\\tkdrm\\OneDrive\\문서\\GitHub\\2WDA_FinTech_Project\\weatherinfodaegu2.xlsx")
df.set_index('일시', inplace=True)
df2=df[0:12]

# 일시 = x축
# 기온 = y축
# 평균 최고 기온 = 파랑 선
# 평균 기온 = 주황 선
# 평균 최저 기온 = 초록 선

plt.plot(df2['평균최고기온(℃)'])
plt.plot(df2['평균기온(℃)'])
plt.plot(df2['평균최저기온(℃)'])
plt.show()