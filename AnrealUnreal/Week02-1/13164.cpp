//HappyKindergarten
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {

	ios_base::sync_with_stdio(0);
	cin.tie(0);

	vector<int> diff;

	int N, K, res = 0, cnt = 0;

	cin >> N >> K;

	int tmp;
	cin >> tmp;

	for (int i = 1; i < N; i++) {
		int input;
		cin >> input;
		if (input - tmp != 0) {
			cnt++;
			diff.push_back(input - tmp);
		}
		tmp = input;
	}

	sort(diff.begin(), diff.end());

	if (K <= cnt) {
		for (int i = 0; i < cnt - K + 1; i++) {
			res += diff[i];
		}
	}
	cout << res << endl;

	return 0;
}