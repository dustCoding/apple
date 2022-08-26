//CowGotchi
//시간초과
#include <iostream>
using namespace std;

int cnt = 0;
long long int Survive(long long int num1, long long int num2) {
	cnt++;
	num1 /= 2;
	if (num1 > 1) {
		return Survive(num1, num2);
	}
	else if (num1 == 1) {
		if (num2 != 0) {
			num1++;
			num2--;
			return Survive(num1, num2);
		}
		else {
			return (int)(cnt + 1);
		}
	}
	else if (num1 == 0) {
		return (int)cnt;
	}

}

int main() {

	ios_base::sync_with_stdio(0);
	cin.tie(0);

	int T, day;

	long long int n, m;

	cin >> T;

	for (int i = 0; i < T; i++) {
		cin >> n >> m;
		day = Survive(n, m);
		printf("%d \n", day);

	}

	return 0;
}