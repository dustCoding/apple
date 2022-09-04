import sys
from collections import deque

n, m, r = map(int, sys.stdin.readline().split())
print = sys.stdout.write

node = [[] for i in range(n + 1)]
visit = [False for i in range(n + 1)]
queue = deque()
res = [0 for i in range(n + 1)]
cnt = 1

def bfs(r):
    global cnt
    tempNode = []
    for i in node[r]:
        if visit[i] == True:
            continue
        visit[i] = True
        tempNode.append(i)
    tempNode.sort()

    queue.extend(tempNode)

    while len(queue) > 0:
        cnt += 1
        i = queue.popleft()
        res[i] = cnt
        bfs(i)

for i in range(m):
    a, b = map(int, input().split())
    node[a].append(b)
    node[b].append(a)

visit[r] = True
res[r] = cnt
bfs(r)

for i in range(1, n + 1):
    print(str(res[i]) + '\n')