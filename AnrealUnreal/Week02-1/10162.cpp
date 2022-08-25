//microwaves
#include <iostream>
using namespace std;

int main() {

    int button[] = { 300, 60, 10 };
    int buttonCount[3] = { 0, };
    int cookingTime;

    cin >> cookingTime;

    if (cookingTime % 10 == 0) {

        while (cookingTime > 0) {
            if (cookingTime >= button[0]) {
                buttonCount[0] = (cookingTime / button[0]);
                cookingTime %= button[0];
            }
            else if (cookingTime >= button[1]) {
                buttonCount[1] = (cookingTime / button[1]);
                cookingTime %= button[1];
            }
            else {
                buttonCount[2] = (cookingTime / button[2]);
                cookingTime %= button[2];
            }
        }
        for (int i = 0; i < 3; i++) {
            printf("%d ", buttonCount[i]);
        }
    }
    else {
        cout << -1 << endl;
    }
}