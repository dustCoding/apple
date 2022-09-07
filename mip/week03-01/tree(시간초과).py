

from sys import stdin

N = int(stdin.readline())

tree = dict()


for i in range(1, N+1):
    tree[i] = []

for i in range(N-1):
    x,y = map(int, stdin.readline().split())
    if any(y in l for l in tree.values()) or y ==1:
        tree[y].append(x)
    else:
        tree[x].append(y)

print(tree)

for i in range(2, N+1):
    for k,v in tree.items():
        if i in v:
            print(k)
