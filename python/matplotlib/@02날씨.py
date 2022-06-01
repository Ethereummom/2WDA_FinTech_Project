import matplotlib.pyplot as plt
import pandas as pd
from numpy.random import randn as rd


data = pd.read_excel("C:\\Users\\tkdrm\\OneDrive\\문서\\GitHub\\2WDA_FinTech_Project\\asdf.xlsx")
df = pd.DataFrame(data, index=data['일시'])

print(df)


print(df.iloc[0])

print(df.columns[4])

print(df['일시'])
print(df['평균최고기온(℃)'])

# 일시 = x축
# 평균 기온 = 초록 선
# 평균 최저 기온 = 파랑 선
# 평균 최고 기온 = 빨간 선

# plt.plot(df['평균최고기온(℃)'])
# plt.plot(df['평균기온(℃)'])
# plt.plot(df['평균최저기온(℃)'])
# plt.show()