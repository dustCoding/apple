//Queue
#include <iostream>
#include <string>
#include <queue>
using namespace std;

queue<int> qu;
int num, inputNum = 0;

void IntQue(string s) {

    if (s == "push") {

        cin >> inputNum;

        qu.push(inputNum);
    }
    else if (s == "pop") {
        if (!qu.empty()) {
            cout << qu.front() << endl;
            qu.pop();
        }
        else {
            cout << -1 << endl;
        }
    }
    else if (s == "size") {
        cout << qu.size() << endl;
    }
    else if (s == "empty") {
        cout << qu.empty() << endl;
    }
    else if (s == "front") {
        if (!qu.empty()) {
            cout << qu.front() << endl;
        }
        else {
            cout << -1 << endl;
        }
    }
    else if (s == "back") {
        if (!qu.empty()) {
            cout << qu.back() << endl;
        }
        else {
            cout << -1 << endl;
        }
    }
}


int main() {
    string str;

    cin >> num;

    for (int i = 0; i < num; i++) {

        cin >> str;
        IntQue(str);

    }


    return 0;
}