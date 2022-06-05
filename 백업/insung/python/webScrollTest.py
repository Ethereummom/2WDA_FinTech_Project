import imp
from urllib import response
import requests
from bs4 import BeautifulSoup

url = "http://www.yjp.ac.kr/portal/main/index_main.jsp"
response = requests.get(url).text

soup = BeautifulSoup(html, "html5lib")
tags = soup.select("_eps")
tag = tags[0]
print(tag.text)