//24444 BFS
#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	int N, M, R;
	int cnt = 1;
	cin >> N >> M >> R;

	int* arr = new int[N + 1];
	arr[0] = 0;

	vector<vector<int>> v(N + 1);
	queue<int> q;


	for (int i = 0; i < M; i++) {
		int a, b;
		cin >> a >> b;
		v[a].push_back(b);
		v[b].push_back(a);
	}

	for (int i = 0; i < N + 1; i++) {
		arr[i] = 0;
		sort(v[i].begin(), v[i].end());
	}

	arr[R] = cnt;
	q.push(R);

	while (!q.empty()) {
		int parent = q.front();
		int length = v[parent].size();
		for (int i = 0; i < length; i++) {
			if (arr[v[parent][i]] == 0) {
				cnt++;
				arr[v[parent][i]] = cnt;
				q.push(v[parent][i]);

			}
		}
		q.pop();
	}

	for (int i = 1; i < N + 1; i++) {
		printf("%d ", arr[i]);
	}

	delete[] arr;
	return 0;
}