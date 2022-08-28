// 황소 다마고치: https://www.acmicpc.net/problem/23323

/* dev/stdin */
const input = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n");
let T = input.shift(); // 테스트케이스 수

const testcase = input.map((x) => x.trim().split(" ")); // 테스트 케이스

for (let i = 0; i < T; i++) {
  let [n, m] = testcase[i].map(Number); // 각 테스트케이스에서 n과 m으로 나뉨.
  let count = 0;
  while (n) {
    // n이 true일 동안 소의 체력이 절반으로 줄어들게 한다. (소수점 버림)
    n = Math.floor(n / 2);
    count++;
  }
  console.log(count + m); // 소가 살아있던 시간 count에 먹이의 수를 더해주면 된다. (소가 먹이없이 체력만 줄어들던 시간 + 먹이를 먹으면 체력이 1 올라가니까 하루 더 살 수 있게 되는 시간)
}
