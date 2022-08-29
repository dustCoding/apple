from sys import stdin

N,K = map(int, stdin.readline().split())


x = []

K


for i in range(1,N):


    if K//(N-i) >= 1:
        K = K - (N-i)
        x.append(N-i+1)



    if K==0:
        l = list(range(1, N+1))
        l = set(l) - set(x)
        l = list(l)
        x = x + l
        break





for j in range(len(x)):
    print(x[j], end=' ')
