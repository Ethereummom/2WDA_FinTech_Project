'''Pandas를 사용한 데이터처리'''

from pandas import Series

data = [100,200,300,400]
s = Series(data)
print(type(s))
'''만든 데이터의 자료형을 확인하면 series형임
<class 'pandas.core.series.Series'>'''
print(s)
'''0    100
1    200
2    300
3    400
dtype: int64
list와 비슷한 형태의 데이터가 출력됨.'''