x  = sys.stdin.readline()

stack = []

for i in range(int(x)):
    cmd = sys.stdin.readline().split()
    if cmd[0] == 'push':
        stack.append(int(cmd[1]))

    elif cmd[0] == 'pop':
        if len(stack)==0:
            print(-1)
        else:
            print(stack.pop())

    elif cmd[0] == 'size':
        print(len(stack))

    elif cmd[0] =='empty':
        if len(stack)==0:
            print(1)
        else:
            print(0)

    elif cmd[0] =='top':
        if len(stack)==0:
            print(-1)
        else:
            print(stack[-1])
