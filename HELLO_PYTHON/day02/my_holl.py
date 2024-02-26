from random import random
com = "";
my = "";
result = "";

my = input("홀,짝을 입력하시오")

ran = random()

if ran >0.5:
    com = "홀"
else:
    com = "짝"

if my==com:
    result = "이김"
else:
    result = "짐"

print("나 : ", my)
print("컴 : ", com)
print("결과 : ", result)