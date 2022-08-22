# 백준 1550번 : 16진수 

# 문제 : 16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.

# 입력
    # 첫째 줄에 16진수 수가 주어진다. 
    # 이 수의 최대 길이는 6글자이다. 
    # 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다. 
    # 또, 이 수는 음이 아닌 정수이다.

# 출력
# 첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.

# print("16진수를 입력하시오(최대6글자)")
num = input()
sum = 0

numArr = list(num)
# print(numArr)
lnNum = len(numArr)

index=lnNum-1
for i in range(0,lnNum):
    if index>0:
        # print("index:",index)
        # print("i:",i)
        if numArr[i]=='a' or numArr[i]=='A' : sum += 10*(16**index);
        elif numArr[i]=='b' or numArr[i]=='B': sum += 11*(16**index);
        elif numArr[i]=='c' or numArr[i]=='C': sum += 12*(16**index);
        elif numArr[i]=='d' or numArr[i]=='D': sum += 13*(16**index);
        elif numArr[i]=='e' or numArr[i]=='E': sum += 14*(16**index);
        elif numArr[i]=='f' or numArr[i]=='F': sum += 15*(16**index);
        else : sum +=int(numArr[i])*(16**index);
        # print(sum)
        
    if index==0:
        # print("index:",index)
        # print("i:",i)
        if numArr[i]=='a' or numArr[i]=='A' : sum += 10;
        elif numArr[i]=='b' or numArr[i]=='B': sum += 11;
        elif numArr[i]=='c' or numArr[i]=='C': sum += 12;
        elif numArr[i]=='d' or numArr[i]=='D': sum += 13;
        elif numArr[i]=='e' or numArr[i]=='E': sum += 14;
        elif numArr[i]=='f' or numArr[i]=='F': sum += 15;
        else : sum +=int(numArr[i]);
        # print(sum)
    index=index-1;

print(sum)
