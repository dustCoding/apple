#include <iostream>
using namespace std;

struct Cow {
    int arrive, check; //도착시간, 검문시간

};

int main() {

    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int inputNum;
    
    cin >> inputNum;

    Cow* CowTime = new Cow[inputNum];

    for (int i = 0; i < inputNum; i++) {
        cin >> CowTime[i].arrive >> CowTime[i].check;
    }

    for (int i = 0; i < inputNum-1; i++) {
        for (int j = i+1; j < inputNum; j++) {
            Cow Tmp;
            if (CowTime[i].arrive > CowTime[j].arrive) {
                Tmp = CowTime[i];
                CowTime[i] = CowTime[j];
                CowTime[j] = Tmp;
            }
        }
    }//arriveTime으로 Sort 완료

    int result = CowTime[0].arrive+CowTime[0].check; //최종시간 초기화

    for (int i = 1; i < inputNum; i++) {
        if (result < CowTime[i].arrive) {
            result = CowTime[i].arrive + CowTime[i].check;
        }
        else {
            result += CowTime[i].check;

        }
    }

    printf("%d\n", result);

    delete[] CowTime;

    return 0;
}