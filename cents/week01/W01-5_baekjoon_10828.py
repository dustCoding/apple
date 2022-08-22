# 백준 10828 : 스택 
#   - https://www.acmicpc.net/problem/10828

# 문제 : 
    # 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

    # 명령은 총 다섯 가지이다.

    # push X: 정수 X를 스택에 넣는 연산이다.
    # pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    # size: 스택에 들어있는 정수의 개수를 출력한다.
    # empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    # top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

# 입력 : 
    # 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
    # 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
    # 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
    # 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

# 출력 : 
    # 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
import sys
count = int(sys.stdin.readline())
# count = int(input())
# print("count : ", count)
i=0
arr = []
while i<count:
    # comd = input()
    comd = sys.stdin.readline().split()

    # input() 함수를 사용할 경우, 
    # 시간초과 에러가 뜨므로 시간단축을 위해 sys.stdin.readline()을 사용한다.
    # 입출력 속도 비교 : sys.stdin.readline > raw_input() > input()

    # print("comd : ", comd)
    # print("comd0 : ",comd[0])
    # print("comd1 : ",comd[1])
    if comd[0] == "top" :
        if len(arr)==0:
            print("-1")
        else:    
            # print("len : ",len(arr))
            print(arr[len(arr)-1])
    elif comd[0] == "size" :
        print(len(arr))
    elif comd[0] == "pop" :
        if len(arr)==0:
            print("-1")
        else:
            print(arr.pop())
            # print("arr : ",arr)
    elif comd[0] == "empty" :
        if len(arr) == 0 :
            print("1")
        else :
            print("0")
    elif comd[0] == "push":
        arr.append(comd[1])
        # print("arr : ",arr)
    i+=1