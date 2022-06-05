# 라이브러리 준비하기
import csv
import requests
from bs4 import BeautifulSoup

url ="https://comic.naver.com/webtoon/weekday"

# 엑셀 파일로 저장하기
filename = "네이버 웹툰 인기 순위.csv"
f = open(filename, "w", encoding="utf-8-sig", newline="")
writer = csv.writer(f)

columns_name = ["순위", "웹툰명"] # 컬럼 속성명 만들기

writer.writerow(columns_name)

# 웹 서버에 요청하기
res = requests.get(url)
res.raise_for_status()

# soup 객체 만들기
soup = BeautifulSoup(res.text, "lxml")
cartoonsBox = soup.find('ol', attrs={"class": "asideBoxRank"}) # 전체 영역에서 'a' 태그를 찾지 않고 인기 급상승 영역으로 범위 제한
cartoons = cartoonsBox.find_all('a') # 인기 급상승 영역에서 'a'태그 모두 찾아 변수 cartoons에 할당

i = 1

# 반복문으로 제목 가져오기(터미널 창 출력 및 엑셀 저장)
for cartoon in cartoons: 
  title = cartoon.get("title") 
  print(f"{str(i)}위: {title}")
  data = [str(i), title]
  writer.writerow(data)
  i += 1