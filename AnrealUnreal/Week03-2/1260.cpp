#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

void DSP(int *arr, vector *v){
	
}
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);

	int N, M, V;

	cin>>N>>M>>V;

	vector<vector<int>> v(N+1);
	queue<int> q;
	int* arr=new arr[N+1];
	arr[0]=0;

	for(int i=0;i<M;i++){
		int a, b;
		cin>>a>>b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	for(int i=1;i<N+1;i++){
		arr[i]=0;
		sort(v[i].begin(), v[i].end());
	}
	int tmp=V;
	q.push_back(tmp);
	arr[tmp]=-1;
	for(int i=1;i<N+1;i++){
		int vlenth=v[tmp].size();
		for(int j=0;j<vlenth;j++){
			int num=v[tmp][j];
			if(arr[num]==0) arr[num]=v[tmp];
			else continue;
		}

	}






	return 0;
}