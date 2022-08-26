//CowBurger
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);

	int B, C, D;
	int sum = 0, sumDC=0;
	cin >> B >> C >> D;

	int min;
	if (B < C) {
		if (B < D) min = B;
		else min = D;
	}
	else if (C < D) {
		if (C < B) min = C;
		else min = B;
	}
	else {
		if (D < C) min = D;
		else min = C;
	}

	vector<int> b(B);
	vector<int> c(C);
	vector<int> d(D);

	for (int i = 0; i < B; i++) {
		cin >> b[i];
		sum +=b[i];
	}
	for (int i = 0; i < C; i++) {
		cin >> c[i];
		sum += c[i];
	}
	for (int i = 0; i < D; i++) {
		cin >> d[i];
		sum += d[i];
	}

	sort(b.begin(), b.end());
	sort(c.begin(), c.end());
	sort(d.begin(), d.end());

	while (min--) {
		sumDC = sumDC + b.back() + c.back() + d.back();
		b.pop_back();
		c.pop_back();
		d.pop_back();
	}

	sumDC *= 9;
	sumDC /= 10;

	for (int i = 0; i < b.size(); i++) {
		sumDC += b[i];
	}
	for (int i = 0; i < c.size(); i++) {
		sumDC += c[i];
	}
	for (int i = 0; i < d.size(); i++) {
		sumDC += d[i];
	}

	printf("%d \n%d", sum, sumDC);

	return 0;
}