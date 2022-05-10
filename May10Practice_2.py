import requests
from bs4 import BeautifulSoup
'''모듈 import하기'''

url = "http://finance.naver.com/item/main.nhn?code=000660"
html = requests.get(url).text

'''url과 html 정의하기 
requests모듈이용해서 웹 페이지 다운로드'''

soup = BeautifulSoup(html, "html5lib")
tags = soup.select("table tbody tr td em")

'''Beautifulsoup모듈 통해서 가져온 html parsing하기
select로 다중셀렉팅하기'''

for tag in tags:
    print(tag.text)

    '''id가 따로 없는 html 태그를 전체 파싱하기 1단계 완료'''