

from sys import stdin
T = int(stdin.readline())


c = 0



for i in range(int(T)):

    n, m = list(map(int, stdin.readline().split()))
    while(1):
        if n ==1:
            c +=1
            break
        else:
            n = n//2
            c +=1
    print(c+m)
    c = 0
