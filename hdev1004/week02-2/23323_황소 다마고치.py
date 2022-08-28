t = int(input())
res = [0 for i in range(t)]
memo = [-1 for i in range(1000000)]

def dp(n):
    if n == 1:
        return 1

    if n < 1000000 and memo[n] > 0:
        return memo[n]

    val = dp(n // 2) + 1
    if n < 1000000:
        memo[n] = val
    return val

for i in range(t):
    n, m = map(int, input().split())
    print(dp(n) + m)