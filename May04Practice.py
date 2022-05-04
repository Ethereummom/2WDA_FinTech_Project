import requests # request메서드호출
from bs4 import BeautifulSoup # bs4메서드를 Beautifulsoup

url = "https://finance.naver.com/item/main.nhn?code=000660"
html = requests.get(url).text

soup = BeautifulSoup(html, "html.parser")
tags = soup.select("#_per")
tag = tags[0]
print(tag)