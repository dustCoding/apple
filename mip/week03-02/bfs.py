
import sys
from collections import deque

sys.setrecursionlimit(10**9)

N, M, R = map(int, sys.stdin.readline().split())


tree = {}
visited = [False]*(N+1)
Ans = {}

for i in range(1,N+1):
    tree[i] = []
    Ans[i] = 0

for _ in range(M):
    x, y = map(int, sys.stdin.readline().split())

    tree[x].append(y)
    tree[y].append(x)




def bfs(tree, visited, start):

    c = 2
    visited[start] = True
    que = deque()
    que.append(start)
    Ans[start] = 1
    while(que):
        x = que.popleft()
        tree[x].sort()
        for i in tree[x]:
            if not visited[i]:
                visited[i] = True
                que.append(i)
                Ans[i] = c
                c+=1

bfs(tree,visited,R)


for i in range(1, N+1):
    print(Ans[i])
