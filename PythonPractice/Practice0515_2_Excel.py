import pandas as pd
## pip install openpyxl 해주기
dta = pd.read_excel("C:\\prac.xlsx")
## 엑셀 파일을 읽어와서 콘솔에 표시
print(dta)
## 'high'를 인덱스로 데이터 표현하기
dta = dta.set_index('high')
print(dta)

#dta.to_excel(..경로)를 통하여 바탕화면에 prac2.xlsx 파일 생성
dta.to_excel("C:\\Users\sangh\OneDrive\바탕 화면\prac2.xlsx")
