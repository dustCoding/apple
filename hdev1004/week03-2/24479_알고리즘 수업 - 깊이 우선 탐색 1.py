import sys
sys.setrecursionlimit(10 ** 5)

input = sys.stdin.readline
print = sys.stdout.write

n, m, r = map(int, input().split())
node = [[] for i in range(n + 1)]
visit = [False for i in range(n + 1)]
stack = []
res = [0 for i in range(n + 1)]
cnt = 1

def dfs(r):
    global cnt
    tempNode = [] 
    for i in node[r]:
        if visit[i] == True:
            continue
        tempNode.append(i)
    tempNode.sort(reverse=True)
    stack.extend(tempNode)


    while(len(stack) > 0):
        cnt += 1
        p = stack.pop()
        while(visit[p] == True):
            if len(stack) > 0:
                p = stack.pop()
            else:
                break

        if(visit[p] == False):
            visit[p] = True
            res[p] = cnt
            dfs(p)
    return

for i in range(m):
    a, b = map(int, input().split())
    node[a].append(b)
    node[b].append(a)

res[r] = cnt
visit[r] = True
dfs(r)

for i in range(1, n + 1):
    print(str(res[i]) + '\n')