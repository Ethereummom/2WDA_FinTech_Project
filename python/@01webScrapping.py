import requests
from bs4 import BeautifulSoup

def get_per(code):
    url = "http://finance.naver.com/item/main.nhn?code=" + code
    html = requests.get(url).text

    soup = BeautifulSoup(html,"html5lib")
    tags = soup.select("#_per")
    tag = tags[0]
    return float(tag.text)

def get_dividend(code):
    url = "http://finance.naver.com/item/main.nhn?code=" + code
    html = requests.get(url).text

    soup = BeautifulSoup(html,"html5lib")
    tags = soup.select("#_dvr")
    tag = tags[0]
    return float(tag.text)

print(get_per("000660"))
print(get_dividend("000660"))
# 고려산업 코드 002140
print(get_per("002140"))

url = "http://finance.naver.com/item/main.nhn?code=000660"
html = requests.get(url).text

soup = BeautifulSoup(html,"html5lib")
tags = soup.select(".lwidth tbody .strong td em")
# tags2 = soup.select("table tbody tr td em")
tags2 = soup.select("#tab_con1 > div:nth-child(3) > table > tbody > tr.strong > td > em")
# BS 모듈이 CSS 셀렉터를 100%지원하지 않아 nth-child를 인식 못한다고 했었는데 인식잘한다.
# 혹여 인식 못한다면 nth-of-type()을 사용하면된다.
tag2 = tags2[0]

for tag in tags:
    print(tag.text)

print(tag2.text)

# for tag2 in tags2:
#     print(tag2.text)