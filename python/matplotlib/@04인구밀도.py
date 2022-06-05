import matplotlib.pyplot as plt
import pandas as pd
from matplotlib import font_manager, rc

font_path = "C:/Windows/Fonts/NGULIM.TTF"
font = font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font)

df = pd.read_excel("C:\\Users\\tkdrm\\OneDrive\\문서\\GitHub\\2WDA_FinTech_Project\\인구밀도_인구주택총조사기준__20220602004616.xlsx", engine = "openpyxl")
전체인구20년 = df


전체인구20년.set_index("행정구역별", inplace=True)
t1 = 전체인구20년

print(전체인구20년)


# plt.plot(전체인구20년['2020'])
# plt.show()

대구연도별 = df.iloc[3]
t2 = 대구연도별
print(대구연도별)


plt.figure(1)
plt.plot(t1)

plt.figure(2)
plt.bar(t2)

# plt.subplot(대구연도별)
plt.show()