//stack
#include <iostream>
#include <string>
#include <stack>
using namespace std;

stack<int> st;
int num, inputNum = 0;

void IntStack(string s) {

    if (s == "push") {

        cin >> inputNum;

        st.push(inputNum);
    }
    else if (s == "pop") {
        if (!st.empty()) {
            cout << st.top() << endl;
            st.pop();
        }
        else {
            cout << -1 << endl;
        }
    }
    else if (s == "size") {
        cout << st.size() << endl;
    }
    else if (s == "empty") {
        cout << st.empty() << endl;
    }
    else if (s == "top") {
        if (!st.empty()) {
            cout << st.top() << endl;
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
        IntStack(str);

    }


    return 0;
}