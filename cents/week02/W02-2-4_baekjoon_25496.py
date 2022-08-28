# 백준 25496 : 장신구 명장 임스
# https://www.acmicpc.net/problem/25496

# 문제 : 
    # 메이플스토리에는 전문 기술이라는 제작 시스템이 있다. 
    # 전문 기술은 특정량의 피로도가 쌓이는 대신 다양한 장비 및 비약을 제작할 수 있는 시스템이다. 
    # 장신구 명장인 임스는 어떻게 하면 더 효율적으로 많은 장신구를 제작할 수 있을지 고민에 빠졌다.

    # 임스가 만들 수 있는 장신구는 $N$개가 있고, 각각의 장신구를 만들면 $A_i$만큼의 피로도가 누적된다.

    # 피로도가 $200$ 미만인 경우, 장신구를 제작할 수 있다. 
    # 현재 쌓인 피로도가 $P$일 때, 임스가 제작할 수 있는 장신구의 최대 개수를 구해보자!

# 입력 : 
    # 첫 번째 줄에 정수 $P$와 정수 $N$이 공백으로 구분되어 주어진다. ($1 \le P \le 200$, $1 \le N \le 1\,000$)

    # 두 번째 줄에는 정수 $A_1, A_2, \dots, A_N$이 공백으로 구분되어 주어진다. ($1 \le A_i \le 200$)

# 출력 : 
    # 제작할 수 있는 장신구의 최대 개수를 출력하시오.

################################################

import sys
# B, C, D = sys.stdin.readline().split()
P,N = map(int, input().split())
# P : 피로도
# N : 장신구 수
stress = list(map(int, input().split()))

# print(P)
# print(N)
# print(stress)
stress.sort()
# print(stress)
cnt = 0
for _ in range(N):
    if P<200:
        cnt+=1
        P+=stress[_]
print(cnt)    
