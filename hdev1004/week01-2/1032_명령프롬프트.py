n = int(input())
flag = False
arr = []
res = []

for i in range(n):
    arr.append(input())

for i in range(len(arr[0])):
    flag = False
    compare = arr[0][i]
    for a in arr:
        if compare != a[i]:
            flag = True
            res.append("?")
            break
    
    if flag == False:
        res.append(compare)

print("".join(res))
