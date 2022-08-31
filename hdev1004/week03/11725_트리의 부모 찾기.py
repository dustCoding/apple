n = int(input())
node = [[] for i in range(n + 1)]
visit = [False for i in range(n + 1)]
res = [0 for i in range(n + 1)]

def dfs(k):
    for i in node[k]:
        if visit[i] == True:
            continue
        visit[i] = True
        dfs(i)
        res[i] = k
    

for i in range(n - 1):
    a, b = map(int, input().split())
    node[a].append(b)
    node[b].append(a)

visit[1] = True
dfs(1)

for i in range(2, n + 1):
    print(res[i])