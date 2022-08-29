//CoupleMaking
#include <iostream>

using namespace std;

int main() {

	ios_base::sync_with_stdio(0);
	cin.tie(0);

	int N, K, cnt = 0;

	cin >> N >> K;
	int* arr = new int[N];

	for (int i = 0; i < N; i++) {
		//동적 할당의 경우엔 for(auto i:arr) 형태로 쓸 수 없음
		arr[i] = (i + 1);
	}

	if (K > 0) {
		for (int i = 0; i < N - 1; i++) {

			for (int j = i + 1; j < N; j++) {

				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				cnt++;

				if (K == cnt) break;
			}
			if (K == cnt) break;
		}
	}

	for (int i = 0; i < N; i++) {
		printf("%d ", arr[i]);
		//cout << arr[i] << " ";
	}

	delete[] arr;
	return 0;
}