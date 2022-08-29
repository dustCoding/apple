n = int(input())
arr = []
res = 0

for i in range(n):
    arr.append(list(map(int, input().split())))
arr.sort()

for i in range(len(arr)):
    if res <= arr[i][0]:
        res = arr[i][0] + arr[i][1]
    else:
        res = res + arr[i][1]

print(res)