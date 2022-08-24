/* dev/stdin */
let T = require("fs").readFileSync("dev/stdin").toString().trim();

const button = [300, 60, 10]; // 전자레인지의 각 버튼 (A,B,C)
const count = [0, 0, 0];

// button 배열의 각 원소를 for문을 돈다.
// 만약, 요리시간 T가 각 버튼의 동작시간보다 크다면
// 해당 버튼의 count 원소에 (요리시간 / 동작시간) 즉, 동작 횟수를 넣는다.
// 그 후, 요리시간은 동작하고 남은 시간으로 업데이트 된다.
for (const i in button) {
  if (T >= button[i]) {
    count[i] = Math.floor(T / button[i]);
    T %= button[i];
  }
}

// 요리 시간을 10으로 나눈 나머지가 0이 되지 않는다면 (버튼으로 요리 시간을 정확히 맞출 수 없다면) -1을 출력하고 그렇지 않으면 count를 출력한다.
console.log(T % 10 !== 0 ? -1 : count.join(" "));

// 문제 : https://www.acmicpc.net/problem/10162
