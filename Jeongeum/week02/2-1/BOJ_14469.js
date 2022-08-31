/* dev/stdin */
const input = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((x) => x.split(" ").map(Number)); // 개행 기준으로 나눠 배열을 만들어준 후, 다시 공백 기준으로 나누어 number 타입으로 변형시킨다.

const N = input.shift(); // input 배열 맨 앞의 값을 제거해 변수 N에 선언한다.
const cows = input.sort((a, b) => a[0] - b[0]); // 소가 도착한 시간으로 정렬하여 cows 배열에 선언한다.
let time = 0; // 현재 시간

// cows 배열의 값을 비구조화 할당을 통해 각각 arrive, check 변수에 선언한다.
// 만약, 현재 시간이 다음 소가 도착할 시간보다 작아서 소가 대기 없이 검문 받을 수 있다면 (arrive >= time) -> 도착시간 + 검문시간
// 현재 시간이 다음 소가 도착할 시간보다 커서 소가 이미 와서 대기중이라면 (arrive < time) -> 현재시간 + 검문시간

for (let i = 0; i < N; i++) {
  const [arrive, check] = cows[i];
  if (arrive >= time) {
    time = arrive + check;
  } else time += check;
}

console.log(time);

// 문제 : https://www.acmicpc.net/problem/14469
