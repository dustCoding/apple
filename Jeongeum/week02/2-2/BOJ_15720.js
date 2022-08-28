// 카우버거 : https://www.acmicpc.net/problem/15720

/* dev/stdin */
const input = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n"); // 입력값을 개행 기준으로 나눈다.

const [B, C, D] = input.shift().split(" "); // input의 첫번째 요소를 공백 기준으로 B,C,D에 나눠 선언한다.

// 버거/사이드/음료 : input의 첫번째 요소를 공백 기준으로 나눈 후 각 요소를 Number 타입으로 새롭게 지정 -> 내림차순 정렬한다.
const burger = input
  .shift()
  .split(" ")
  .map((x) => Number(x))
  .sort((a, b) => b - a);

const side = input
  .shift()
  .split(" ")
  .map((x) => Number(x))
  .sort((a, b) => b - a);

const drink = input
  .shift()
  .split(" ")
  .map((x) => Number(x))
  .sort((a, b) => b - a);

let afterPrice = 0;
let beforePrice = 0;

/*
=> 세트 할인 적용된 후 최소 가격 출력 함수
- 세트(버거+사이드+음료)를 만들 수 있어야 하기 때문에 B,C,D 중 가장 작은 값을 size로 정한다.
- size 만큼 for문을 돌면서 세트를 만들어 할인 가격을 만들어 합한다.
- 버거/사이드/음료 배열을 내림차순 정렬했기 때문에 맨 앞 값이 가장 큰 값이다.
- 때문에 for문 한번 돌때마다 맨 앞 값을 제거한다.
- 세트를 만들지 못한 남은 메뉴들은 세트할인이 적용된 result에 차례로 더한다.
*/

function discount(burger, side, drink) {
  const size = Math.min(B, C, D);
  for (let i = 0; i < size; i++) {
    afterPrice += (burger[0] + side[0] + drink[0]) * 0.9;
    burger.shift();
    side.shift();
    drink.shift();
  }

  for (let i = 0; i < burger.length; i++) {
    afterPrice += burger[i];
  }

  for (let i = 0; i < side.length; i++) {
    afterPrice += side[i];
  }

  for (let i = 0; i < drink.length; i++) {
    afterPrice += drink[i];
  }

  console.log(afterPrice);
}

// 세트 할인 적용되기 전 가격 출력
for (let i = 0; i < B; i++) {
  beforePrice += burger[i];
}

for (let i = 0; i < C; i++) {
  beforePrice += side[i];
}

for (let i = 0; i < D; i++) {
  beforePrice += drink[i];
}

console.log(beforePrice);
discount(burger, side, drink);
