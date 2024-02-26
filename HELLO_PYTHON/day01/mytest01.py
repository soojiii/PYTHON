# 출력할 단수를 입력하세요 4
# 4*1=4
# 4*2=8
# 생략
# 4*9=36

dan = input("출력할 단수를 입력하세요")
idan = int(dan)

for i in range(1, 9+1):
    print(str(idan)+"*"+str(i)+"="+str(i*idan))

# print(str(idan)+"*"+str(1)+"="+str(1*idan))
# print(str(idan)+"*"+str(2)+"="+str(2*idan))
# print(str(idan)+"*"+str(3)+"="+str(3*idan))
# print(str(idan)+"*"+str(4)+"="+str(4*idan))
# print(str(idan)+"*"+str(5)+"="+str(5*idan))
# print(str(idan)+"*"+str(6)+"="+str(6*idan))
# print(str(idan)+"*"+str(7)+"="+str(7*idan))
# print(str(idan)+"*"+str(8)+"="+str(8*idan))
# print(str(idan)+"*"+str(9)+"="+str(9*idan))
    
# 10개 미만은 for문 안쓰는것도 좋음



