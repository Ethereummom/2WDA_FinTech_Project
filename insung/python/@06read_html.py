from encodings import utf_8
import pandas as pd
url = "https://finance.naver.com/item/sise_day.nhn?code=066570" 
df = pd.read_html(url, encoding='utf_8')
print(df[0])

