# 첫수를 입력하시오 1
# 끝수를 입력하시오 10
# 배수를 입력 하시오 5
# 1에서 10까지 5의 배수의 합은 15 입니다 (5+10)

a = int(input("첫수를 입력하시오"))
b = int(input("끝수를 입력하시오"))
c = int(input("배수를 입력하시오"))

sum=0

for i in range(a,b+1):
    if(i%c)==0:
        sum += i
        
print("{}에서 {}까지 {}의 배수의 합은 {}입니다".format(a,b,c,sum))

