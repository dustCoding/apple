//Prompt
#include <iostream>
#include <cstring>

using namespace std;

int main() {
	int num; //입력 받는 정수
	int intlength; //문장 길이
	cin >> num;
	char** arr = new char* [num];

	for (int i = 0; i < num; i++) {
		arr[i] = new char[51];
	}

	for (int i = 0; i < num; i++) {
		cin >> arr[i];
		intlength = strlen(arr[0]);
	}
	char* res = new char[intlength];

	for (int i = 0; i < intlength; i++) {
		int cnt = 0;
		for (int j = 0; j < num; j++) {
			if (arr[j][i] != arr[0][i]) break;

			else cnt++;
		}
		if (cnt == num) res[i] = arr[0][i];
		else res[i] = '?';
	}

	for (int i = 0; i < intlength; i++) {
		printf("%c", res[i]);
	}


	delete[] res;
	for (int i = 0; i < num; i++) {
		delete[] arr[i];
	}
	delete[] arr;
	return 0;
}