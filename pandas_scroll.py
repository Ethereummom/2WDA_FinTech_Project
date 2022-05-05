import pandas as pd
url = "http://finance.naver.com/item/main.nhn?code=000660"
df = pd.read_html(url, encoding = "UTF-8")
print(df[0])
