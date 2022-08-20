import queue
import sys

queue = []

print = sys.stdout.write
n = int(input())
res = []

for i in range(n):
    _in = sys.stdin.readline()
    command = _in.split()
    command[0] = command[0].strip()

    if command[0] == "push":
        queue.append(command[1].strip())
    elif command[0] == "pop":
        if len(queue) == 0:
            res.append("-1")
        else:
            res.append(queue.pop(0))
    elif command[0] == "size":
        res.append(str(len(queue)))
    elif command[0] == "empty":
        if len(queue) == 0:
            res.append("1")
        else:
            res.append("0")
    elif command[0] == "front":
        if len(queue) == 0:
            res.append("-1")
        else:
            res.append(queue[0])
    elif command[0] == "back":
        if len(queue) == 0:
            res.append("-1")
        else:
            res.append(queue[len(queue) - 1])

for i in res:
    print(i + "\n")

