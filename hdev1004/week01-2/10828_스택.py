import sys
print = sys.stdout.write

n = int(input())
stack = []
res = []

for i in range(n):
    _in = sys.stdin.readline()
    command = _in.split(" ")
    command[0] = command[0].strip()

    if command[0] == "push":
        stack.append(command[1].strip())
    
    elif command[0] == "pop":
        if len(stack) > 0:
            res.append(stack.pop())
        else:
            res.append("-1")
    
    elif command[0] == "size":
        res.append(str(len(stack)))
    
    elif command[0] == "empty":
        if len(stack) == 0:
            res.append("1")
        else:
            res.append("0")
    
    elif command[0] == "top":
        if len(stack) == 0:
            res.append("-1")
        else:
            res.append(stack[len(stack) - 1])

for i in res:
    print(i + "\n")