
import sys
from collections import deque

sys.setrecursionlimit(10**9)

N, M, R = map(int, sys.stdin.readline().split())


tree = {}
visited = [False]*(N+1)


for i in range(1,N+1):
    tree[i] = []


for _ in range(M):
    x, y = map(int, sys.stdin.readline().split())

    tree[x].append(y)
    tree[y].append(x)


def dfs(tree,visited,start):

    visited[start]=True
    print(start, end=' ')
    l = tree[start]
    l.sort()

    for i in l:
        if not visited[i]:
            dfs(tree,visited,i)

dfs(tree,visited,R)


visited = [False]*(N+1)




print()

def bfs(tree, visited, start):


    visited[start] = True
    print(start, end=' ')
    que = deque()
    que.append(start)

    while(que):
        x = que.popleft()
        tree[x].sort()
        for i in tree[x]:
            if not visited[i]:
                visited[i] = True
                print(i, end=' ')
                que.append(i)





bfs(tree,visited,R)
