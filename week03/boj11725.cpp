#include <iostream>
#include <vector>
#define MAX 100001
using namespace std;
int n, x, y, visited[MAX];
vector<int> v[MAX];

void dfs(int a){
    for(int i=0;i<v[a].size();++i){
        if(!visited[v[a][i]]){
            visited[v[a][i]] = a;
            dfs(v[a][i]);
        }
    }
}

int main(){
    cin>>n;
    for(int i=0;i<n-1;++i){
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    
    dfs(1);
    
    for(int i=2;i<=n;++i){
        cout<<visited[i]<<'\n';
    }
    return 0;
}
