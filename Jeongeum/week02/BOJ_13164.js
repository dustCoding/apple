/* dev/stdin */
const input = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n");

let [x, peoples] = input;
const [N, K] = x.split(" "); // N : 사람 수 , K : 그룹 수
peoples = peoples.split(" "); // 원생들 키를 배열로 만들기

let arr = []; // 인접한 원생 간 키 차이를 담을 배열
let result = 0; // 키 차이의 합을 담을 변수

for (let i = 0; i < N - 1; i++) {
  arr.push(peoples[i + 1] - peoples[i]);
}

arr.sort((a, b) => a - b);

// 원생들의 키 배열 peoples [1 3 5 6 10] 의 각각 키 차이를 구하고 정렬하면 [1 2 2 4] 이다.
// 이 peoples를 3개의 조로 나누면 다음과 같다.
// 1. (1 3) (5 6) (10) / 2. (1 3 5) (6) (10)
// 나뉜 조를 보면 키 차이가 2개씩은 무시된다.
// 1번 조에서는 3과5 , 6과10 / 2번 조에서는 5와6 , 6과10
// N명을 K개 조로 나누었을 때 무시된 키차이를 식으로 생각해보면 N-K개 이다.

for (let i = 0; i < N - K; i++) {
  result += arr[i];
}

console.log(result);

// 문제 : https://www.acmicpc.net/problem/13164
