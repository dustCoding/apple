x = int(input())


A = 300
B = 60
C = 10




if((x%A)%B)%C !=0:
    print(-1)
else:
    print(int(x/A), int((x%A)/B), int(((x%A)%B)/C))
