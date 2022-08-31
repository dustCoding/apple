// 그렇고 그런 사이 : https://www.acmicpc.net/problem/20921

/* dev/stdin */
let [N, K] = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split(" ");

let peoples = [];
let changed = [];
let count = 0;

// 1번 사람부터 N번 사람까지 N명을 일렬로 세우는 배열을 만든다.
for (let i = 0; i < N; i++) {
  peoples[i] = i + 1;
}

/*
그렇고 그런 사이가 되려면 : 왼쪽의 정수 > 오른쪽의 정수
- 왼쪽에 있는 사람의 정수 num이 오른쪽에 있는 사람의 정수보다 큰 경우는 최대 num-1 가지이다. (규칙)
ex)
4 1 2 3 => (4 1) , (4 2) , (4 3) / 3 1 2 4 => (3 1) , (3 2)
- 이 규칙을 이용해서 문제를 풀면 되는데, peoples [1 2 3 4] 에서 맨 뒤부터 차례대로 몇개의 그렇고 그런사이를 만들 수 있는지 확인한다.
- 이때, 정확히 K개의 그렇고 그런 사이를 만들어야 하기 때문에 그보다 넘치면 안된다.
- 그렇기 때문에 N이 i보다 크거나 같은 경우를 조건으로 둔다.
- N-1부터 1까지 줄어드는 i : 맨 뒤부터 peoples 배열 내 각 원소들이 가질 수 있는 그렇고 그런 사이의 개수이다.
(peoples[3] = 4, 4가 가질 수 있는 개수는 3가지)
- K보다 작거나 같은 그렇고 그런 사이를 만들 수 있는 peoples 배열 내 원소를 -1로 바꾸고 changed 배열로 옮긴다.
*/

for (let i = N - 1; i > 0; i--) {
  if (K >= i) {
    K -= i;
    peoples[i] = -1;
    changed[count++] = i + 1;
  }
}

// peoples 배열 내 원소가 0보다 크거나 같다면 changed 배열에 값을 넣는다. (-1로 바꿔준 수는 제외하기 위함)
for (let i = 0; i < N; i++) {
  if (peoples[i] >= 0) {
    changed[count++] = peoples[i];
  }
}
console.log(changed.join(" "));
