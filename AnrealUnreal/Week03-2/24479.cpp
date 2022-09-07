//24479 DFS
#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>

using namespace std;

int N, M, R;
int cnt = 1;
void DFSfnc(queue<int> q, vector<vector<int>> v, int arr[]);

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	cin >> N >> M >> R;

	int* arr = new int[N + 1];
	vector<vector<int>> v(N + 1); //

	queue<int> q;


	for (int i = 0; i < M; i++) {
		int a, b;
		cin >> a >> b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	for (int i = 1; i < N + 1; i++) {
		sort(v[i].begin(), v[i].end());
		arr[i] = 0;
	}

	arr[0] = 0;

	//initialiaze
	q.push(R);
	arr[R] = cnt;

	DFSfnc(q, v, arr);

	for (int i = 1; i < N + 1; i++) {
		printf("%d ", arr[i]);
	}


	delete[] arr;
	return 0;
}

void DFSfnc(queue<int> q, vector<vector<int>> v, int arr[]) {

	if (q.empty()) return;

	int parent = q.back();
	int len = v[parent].size();
	for (int i = 0; i < len; i++) {
		if (arr[v[parent][i]] == 0) {
			cnt++;
			arr[v[parent][i]] = cnt;
			q.push(v[parent][i]);
			//q.pop();
			DFSfnc(q, v, arr);
		}
	}
	q.pop();

}