from pandas import DataFrame

data = {"open" : [737,750], "high" : [755,780] ,
        "low" : [700,710], "close" : [750,770] }
df = DataFrame(data,index=["2022-05-15","2022-05-16"])
print(df)
#데이터프레임 형식 출력하기

