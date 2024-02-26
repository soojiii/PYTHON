# 첫수를 입력하시오 1
# 끝수를 입력하시오 4
# 1에서 4까지의 합은 10입니다.

f = int(input("첫수를 입력하시오"))
l = int(input("끝수를 입력하시오"))

sum = 0

for i in range(f,l+1):
    sum += i
print("{}에서 {}까지의 합은 {}입니다.".format(f,l,sum))
    


