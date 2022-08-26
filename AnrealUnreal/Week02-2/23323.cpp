//CowGotchi
#include <iostream>
using namespace std;

int main() {

	ios_base::sync_with_stdio(0);
	cin.tie(0);

	int T;

	long long int n, m;

	cin >> T;

	for (int i = 0; i < T; i++) {
		cin >> n >> m;
		int cnt = 0;
		while (n) {
			n /= 2;
			cnt++;
		}
		cout << cnt + m << "\n";
	}

	return 0;
}