# 백준 1260 : DFS와 BFS
# https://www.acmicpc.net/problem/1260


# 문제 : 
# 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
# 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
# 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

# 입력 : 
    # 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
    # 탐색을 시작할 정점의 번호 V가 주어진다. 
    # 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
    # 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 
    # 입력으로 주어지는 간선은 양방향이다.

# 출력 : 
    # 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. 
    # V부터 방문된 점을 순서대로 출력하면 된다.

################################################
# 그래프(graph)
    # G = (V, E)
        # V = 정점(Vertex) or 노드(node)
        # E = 간선(Edge)
    # 방향 그래프, 무방향 그래프, 완전 그래프, 부분 그래프
    
# DFS : 깊이 우선 탐색
    #  위부터, 좌부터, 아래로. 오른쪽으로
    # 핵심 : 스택

# BFS : 너비 우선 탐색
    # 시작점인 루트 노드를 시작으로 같은 거리에 있는 노드를 우선적으로 탐색
    # 위부터 , 좌에서 우로, 아래로
    # 핵심 : 큐 자료구조 사용
################################################
# 정점 번호가 작은 것을 먼저 방문
# 오름차순 정렬 sort(reverse=True)
################################################
from collections import deque
import sys
    
    
def DFS(graph, root):
    visited = []
    stack = [root]

    while stack:
        val = stack.pop()
        print("stack pop val : ",val)
        if val not in visited:
            print("visited : ", visited)
            print("val : ", val)
            visited.append(val)
            print("visited append : ", visited)
            if val in graph:
                print("set(graph[",val,"] : ",set(graph[val]), graph[val])
                print("set(visited) : ",set(visited),visited)
                print("list(set(graph[val]) - set(visited) : ",list(set(graph[val]) - set(visited)))
                tmp = list(set(graph[val]) - set(visited))
                tmp.sort(reverse=True)
                stack += tmp
                print("stack : ", stack)
    print("visited : ",visited)
    return " ".join(str(i)for i in visited)

def BFS(graph, root):
    print()

N, M, V = map(int, input().split())
graph = {}

for i in range(M):
    val1, val2 = map(int, input().split())
    if val1 not in graph:
        graph[val1] = [val2]
    elif val2 not in graph[val1]:
        graph[val1].append(val2)
# 단방향
    if val2 not in graph:
        graph[val2] = [val1]
    elif val1 not in graph[val2]:
        graph[val2].append(val1)
# 양방향

print(graph)
print("DFS : ",DFS(graph, V))
# print("BFS : ",BFS(graph, V))
#log

# print(DFS(graph, V))
# print(BFS(graph, V))
