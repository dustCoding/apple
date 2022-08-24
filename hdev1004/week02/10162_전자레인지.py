import sys

res = [0, 0, 0]
n = int(input())

if n % 10 != 0:
    print(-1)
    sys.exit()

res[0] = n // 300
n = n % 300

res[1] = n // 60
n = n % 60

res[2] = n // 10

print(res[0], res[1], res[2])