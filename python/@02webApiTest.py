from sqlite3 import Timestamp
import requests
import datetime

r = requests.get("https://api.korbit.co.kr/v1/ticker/detailed?currency_pair=btc_krw")

bitcoin = r.json()
print(bitcoin)
print(type(bitcoin))
print(bitcoin['last'])

Timestamp = bitcoin['timestamp']
date = datetime.datetime.fromtimestamp(Timestamp/1000)
print(date)