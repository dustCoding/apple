#include <iostream>
#include <algorithm>
#include <set>
#include <map>
#include <vector>
#define ll long long
using namespace std;
struct P {
    ll freq, idx, num;
};

ll n, c, tmp;
map<ll, ll> freq, num;
vector<P> v;

int main() {
    cin>>n>>c;
    for(int i=1; i<=n; ++i){
        cin>>tmp;
        freq[tmp]++;
        if(!num[tmp]) num[tmp]=i;
    }
    
    for(const auto m : freq){
        // cout<<num[m.first]<<" : "<<m.first<<", "<<m.second<<'\n';
        v.push_back({m.second, num[m.first], m.first});
    }
    
    sort(v.begin(), v.end(), [](const P p1, const P p2){
        return p1.freq == p2.freq ? p1.idx < p2.idx : p1.freq > p2.freq;
    });
    
    for(const auto p : v){
        // cout<<p.freq<<" "<<p.idx<<" "<<p.num<<'\n';
        for(int i=0; i<p.freq; ++i){
            cout<<p.num<<' ';
        }
    }
    
    return 0;
}
