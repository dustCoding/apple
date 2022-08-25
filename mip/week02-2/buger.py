
from sys import stdin

n = list(map(int, stdin.readline().split()))

buger = list(map(int, stdin.readline().split()))
side = list(map(int, stdin.readline().split()))
beverage = list(map(int, stdin.readline().split()))

buger.sort()
side.sort()
beverage.sort()

x = sum(buger+side+beverage)

m = 0


for i in range(min(n)):
    m += (buger.pop()+side.pop()+beverage.pop())*0.9


m = m+sum(buger+side+beverage)


print(x)
print(int(m))
