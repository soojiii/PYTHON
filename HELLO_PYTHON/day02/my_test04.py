# 가위,바위,보를 입력하시오
# 나 : 가위
# 컴 : 가위
# 결과 : 비김
from random import random

my=""
com=""
result=""

my = input("가위,바위,보를 입력하시오")

ran = random()

if ran>0.66:
    com="가위"
elif ran >0.33:
    com="바위"
else:
    com="보"


if com=="가위" and my=="가위": result = "비김"
if com=="가위" and my=="바위": result = "이김"
if com=="가위" and my=="보": result = "짐"

if com=="바위" and my=="가위": result = "짐"
if com=="바위" and my=="바위": result = "비김"
if com=="바위" and my=="보": result = "이김"

if com=="보" and my=="가위": result = "이김"
if com=="보" and my=="바위": result = "짐"
if com=="보" and my=="보": result = "비김"


print("나 : {}".format(my))
print("컴 : {}".format(com))
print("결과 : {}".format(result))





