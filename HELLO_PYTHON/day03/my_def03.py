from random import random

def randomHoll():
    ret = "홀"
    if random() >0.5:
        ret="짝"
    return ret

com = randomHoll()
print("com",com)