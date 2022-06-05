
from pandas import DataFrame, Series


data = {'open': [100, 200], "high": [110, 210]} 
df = DataFrame(data ) 
print(df)

data = {"open": [737, 750], "high": [755, 780], "low": [700, 710], "close": [750, 770]} 
df = DataFrame(data , index=["2018-01-01", "2018-01-02"]) 
print(df)

# DataFrame 인덱싱/슬라이싱
data = {"open": [730, 750], "high": [755, 780], "low": [700, 710], "close": [750, 770]} 
df = DataFrame(data , index=["2018-01-01", "2018-01-02"]) 
print(df['open'])
print(df.loc["2018-01-01"])

print("행을 출력")
print(df.iloc[1])

print()
target = ["2018-01-01"]
print(df.loc[target])

print()
target = [0, 1] 
print(df.iloc[target])

print("데이터 프레임 추가")

data = {"open": [737, 750], "high": [755, 780], "low": [700, 710], "close": [750, 770]} 
df = DataFrame(data) 
s = Series([300, 400])
df['volume'] = s
print(df)

df.loc[2] = (100, 200, 300, 400, 500)
print(df)

upper = df["open"] * 1.3
df["upper"] = upper
print(df)

s = ([444, 222, 333])
df['volatillity'] = s
print(df)
