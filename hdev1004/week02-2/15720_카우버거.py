b, c, d = map(int, input().split())

b_arr = list(map(int, input().split()))
c_arr = list(map(int, input().split()))
d_arr = list(map(int, input().split()))

b_arr.sort()
c_arr.sort()
d_arr.sort()

minLen = min(b, c, d)
temp = 0
res = 0
defaultRes = 0

for i in range(minLen):
    temp = (b_arr.pop() + c_arr.pop() + d_arr.pop())
    res += temp * 0.9
    defaultRes += temp

temp = sum(b_arr) + sum(c_arr) + sum(d_arr)
res += temp
defaultRes += temp

print(defaultRes)
print(int(res))
