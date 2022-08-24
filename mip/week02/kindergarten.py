x,y = map(int, input().split())


n = input().split()


diff = []

for i in range(len(n)-1):
    diff.append(int(n[i])-int(n[i+1]))


diff.sort()

sum = sum(diff[y-1:])

print(abs(sum))
