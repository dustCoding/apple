import sys

sys.setrecursionlimit(10**9)



N = int(sys.stdin.readline())

tree = dict()
ans = dict()

visited = [False] *  (N+1)


for i in range(1, N+1):
    tree[i] = []
    ans[i] = []



for i in range(N-1):
    x,y = map(int, sys.stdin.readline().split())
    tree[x].append(y)
    tree[y].append(x)


def dfs(node):
    visited[node] = True
    for i in tree[node]:
        if not visited[i]:
            dfs(i)
            ans[i] = node


dfs(1)


for i in range(2, N+1):
    print(ans[i])
