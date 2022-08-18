x = int(input())

data = []
for i in range(x):
    data.append(input())

v = ""
c = ""

for i in range(len(data[0])):
    for j in range(x):
        if c =="":
            c = data[j][i]
            continue
        elif c == data[j][i]:
            continue
        else:
            c = '?'
    v = v+c
    c =""

print(v)
