import pandas as Series
data = {"open": [730, 750], "high": [755, 780], "low": [700, 710], "close": [750, 770]} 
df = Series.DataFrame(data , index=["2018-01-01", "2018-01-02"]) 

target=["2018-01-01", "2018-01-02"]
print(df.iloc[target])