'''RestfulAPI를 이용한 데이터가져오기'''
import requests
r = requests.get("https://api.korbit.co.kr/v1/ticker/detailed?currency_pair=btc_krw")
print(r.text)
print(type(r))
'''get()으로 !!JSON!!타입의 데이터를 얻어왔음.
이를 다루려면 python dictionary타입으로 변환해주면 됨.
이를 위해 사용하는 것이 Response객체임.'''

bitcoin = r.json()
print(bitcoin)

'''읽어온 JSON의 자료형이 DICTIONARY형으로 변환되었음.'''
print(type(bitcoin))

print(bitcoin['last'])
'''last라는 key를 사용해서, 최종 체결가를 읽어옴'''
print(bitcoin['high'])
'''high라는 key를 사용해서, 현재 최고가를 읽어옴'''
print(bitcoin['volume'])
'''volume라는 key를 사용해서, 현재 거래량을 가져옴.'''