//Find Root Node
#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(0);

	int N;
	cin >> N;

	int* arr = new int[N+1];
	vector<vector<int>> v(N);
	queue<int> qu;

	for (int i = 1; i < N; i++) {
		int n, m;
		cin >> n >> m;
		v[n - 1].push_back(m);
		v[m - 1].push_back(n);
		arr[i] = 0;
	}
	qu.push(1);
	arr[0] = arr[N] = 0;

	for (int i = 0; i < N; i++) {
		
		for (int j = 0; i < v[qu.front()].size(); i++) {
			
			if (arr == 0) {
				arr[v[qu.front()][j]] = i + 1;
				//여기까지 뭔가 해보려고 했지만 잘 안됨
				//풍문으로 큐를 써야 한다는 소리를 들었지만 방문한 노드 처리를 어떻게 해야 할지 감을 잡지 못함
				qu.push(v[i][j]);
			}
			else continue;
		}
		qu.pop();
	}

	//최종 출력
	for (int i = 2; i < N + 1; i++) {
		printf("%d\n", arr[i]);
	}


	delete[] arr;
	return 0;
}