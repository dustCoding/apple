import sys
from collections import deque

sys.setrecursionlimit(10**6)

queue = deque()
stack = []
node = [[] for i in range(1001)]
node_check = [False for i in range(1001)]

def dfs(n):
    print(n, end=' ')
    node[n].sort()

    for i in node[n]:
        if node_check[i] == False:
            stack.append(i)
            node_check[i] = True
            
            dfs(i)
            stack.pop()

def bfs(n):
    print(n, end=' ')
    node[n].sort()

    for i in node[n]:
        if node_check[i] == False:
            queue.append(i)
            node_check[i] = True

    if len(queue) == 0:
        return

    pop = queue.popleft()
    bfs(pop)
    return

n, m, v = map(int, input().split())
node_check[v] = True

for i in range(m):
    a, b = map(int, input().split())
    node[a].append(b)
    node[b].append(a)
    
dfs(v)

print()
node_check = [False for i in range(1001)]
node_check[v] = True
bfs(v)