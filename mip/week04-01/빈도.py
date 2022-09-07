import sys

N, C = map(int,sys.stdin.readline().split())



x = list(map(int, sys.stdin.readline().split()))


d = dict()

count = N

for i in x:
    if i in d.keys():
        d[i][0]+=1
    else:
        d[i] = [1,count]
        count -=1


d3 = sorted(d.items(), key = lambda item : item[1], reverse=True)



for x, y in d3:
    for _ in range(y[0]):
        print(x, end=' ')
