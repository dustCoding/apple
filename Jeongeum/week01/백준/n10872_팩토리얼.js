/* dev/stdin */
const input = require("fs").readFileSync("dev/stdin").toString().trim();

if (input === 0 && input === 1) return 1;

let result = 1;

for (let i = 1; i <= input; i++) {
  result *= i;
}

console.log(result);

/* 재귀함수 방법으로 다시 

const N = parseInt(input);

function factorial(n) {
  if (n === 0) return 1;
  else return n * factorial(n - 1);
}

console.log(factorial(N));

*/

// 문제 : https://www.acmicpc.net/problem/10872
