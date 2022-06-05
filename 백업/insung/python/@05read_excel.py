import pandas as pd
from pandas import DataFrame, Series

import pandas as pd 
df = pd.read_excel("C:\\Users\\tkdrm\\OneDrive\\문서\\GitHub\\2WDA_FinTech_Project\\ohcl.xlsx") 
print(df)

data = {"open": [737, 750], "high": [755, 780], "low": [700, 710], "close": [750, 770]} 
df = DataFrame(data) 
print(df)

df.to_excel("C:\\Users\\tkdrm\\OneDrive\\문서\\GitHub\\2WDA_FinTech_Project\\ohcl2.xlsx")