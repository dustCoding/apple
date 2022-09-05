//DFS, BFS
#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;
queue<int> q;
queue<int> qu;
void DFSfunc(int num, vector<vector<int>> v, int arr[], queue<int> q);

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	int N, M, V;
	cin >> N >> M >> V;

	vector<vector<int>> v(N + 1); //
	int* arr = new int[N + 1];
	int* brr = new int[N + 1];
	arr[0] = brr[0] = 0;

	//Input node, vertex
	for (int i = 0; i < M; i++) {
		int a, b;
		cin >> a >> b;
		v[a].push_back(b);
		v[b].push_back(a);
	}

	//array initialize, vector sorting
	for (int i = 1; i < N + 1; i++) {
		arr[i] = brr[i] = 0;
		sort(v[i].begin(), v[i].end());
	}

	arr[V] = brr[V] = -1;
	q.push(V);

	DFSfunc(V, v, arr, q);

	qu.push(V);

	//BFS
	int parent = qu.front();
	while (!qu.empty()) {
		parent = qu.front();
		int veclength = v[parent].size();
		for (int j = 0; j < veclength; j++) {
			int child = v[parent][j];
			if (brr[child] == 0) {
				brr[child] = parent;
				qu.push(child);
			}
			else continue;
		}
		printf("%d ", qu.front());
		qu.pop();
	}

	delete[] brr;
	delete[] arr;

	return 0;
}

//DFS //DFS 오류 다시 수정할 것
void DFSfunc(int num, vector<vector<int>> v, int arr[], queue<int> q) {

	if (q.empty()) return;

	int veclength = v[num].size();

	for (int i = 0; i < veclength; i++) {
		int child = v[num][i];
		if (arr[child] == 0) {
			arr[child] = num;
			q.push(child);
			cout << q.front() << " ";
			q.pop();
			return DFSfunc(child, v, arr, q);
		}
		//else continue;
	}
	cout << q.front() << "\n";
	q.pop();

}