import matplotlib.pyplot as plt
import pandas as pd

df = pd.read_excel("C:\\Users\\tkdrm\\OneDrive\\문서\\GitHub\\2WDA_FinTech_Project\\OBS_ASOS_MNH_20220601232246.xlsx", engine = "openpyxl")
df.set_index("일시", inplace=True)

# 평균기온(°C)  평균최고기온(°C)  평균최저기온(°C)
plt.plot(df['평균기온(°C)'])
plt.plot(df['평균최고기온(°C)'])
plt.plot(df['평균최저기온(°C)'])
plt.show()

