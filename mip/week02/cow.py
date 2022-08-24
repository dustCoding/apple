cownumber = int(input())

time = []

for i in range(cownumber):
    t1,t2 = input().split()
    time.append([int(t1),int(t2)])

time.sort()

x = 0

for i in time:
    if i[0]>x:
        x = i[0]+i[1]
    else:
        x = x+i[1]


print(x)
