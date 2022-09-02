import sys
sys.setrecursionlimit(10**9)
N,M,R = map(int, sys.stdin.readline().split())

tree = {}
visited = [False]*(N+1)
Ans = {}


for i in range(1,N+1):
    tree[i]=[]
    Ans[i] = 0



for _ in range(M):
    x, y = map(int, sys.stdin.readline().split())
    tree[x].append(y)
    tree[y].append(x)




c= 1

def dfs(tree,visited,start):
    global c
    visited[start]=True
    Ans[start] = c
    l = tree[start]
    l.sort()

    for i in l:
        if not visited[i]:
            c+=1
            dfs(tree,visited,i)


dfs(tree,visited,R)





for i in range(1,N+1):
    print(Ans[i])
