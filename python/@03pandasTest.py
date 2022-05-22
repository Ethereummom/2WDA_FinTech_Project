from pandas import Series

data = [100, 200, 300, 400]
s = Series(data)

# print(type(s))
print(s)

date = ['2018-08-01', '2018-08-02', '2018-08-03', '2018-08-04', '2018-08-05']
xrp_close = [512, 508, 512, 507, 500]
s = Series(xrp_close, index = date)
print(s)

print(s[[0,3]])
print("8월 2~4")
print(s[['2018-08-02', '2018-08-04']])

print(s[0 : 2]) # 끝값[2] 포함안됨
print(s['2018-08-01': '2018-08-03']) # 사용자가 지정시 끝값 포함

# series 추가 / 삭제
