//DFS 24479
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int visited[100001] = { 0 };
int arr[100001] = { 0 };
int cnt;
vector<vector<int>> v(100001);
void DFSfunc(int parent);

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	int N, M, R;
	cin >> N >> M >> R;

	for (int i = 0; i < M; i++) {
		int a, b;
		cin >> a >> b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	for (int i = 1; i < N + 1; i++) {
		sort(v[i].begin(), v[i].end());
	}

	DFSfunc(R);

	for (int i = 1; i < N + 1; i++) {
		printf("%d ", arr[i]);
	}

	return 0;
}

void DFSfunc(int parent) {

	if (visited[parent] != 0) return;

		visited[parent] = 1;
		cnt++;
		arr[parent] = cnt;

		for (int i = 0; i < v[parent].size(); i++) {
			DFSfunc(v[parent][i]);
		}

}