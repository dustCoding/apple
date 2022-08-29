//Factorial
#include <iostream>
using namespace std;

int Facto(int num) {

	if (num <= 1) return 1;

	return Frac(num - 1) * num;
}

int main() {

	int num;

	cin >> num;

	printf("%d", Facto(num));
}