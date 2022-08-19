/* dev/stdin */
const input = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n");

const N = input.shift();
let queue = [];
const result = [];

for (let i = 0; i < N; i++) {
  switch (input[i]) {
    case "pop":
      result.push(queue.shift() || -1);
      break;

    case "size":
      result.push(queue.length);
      break;

    case "empty":
      result.push(queue[0] ? 0 : 1);
      break;

    case "front":
      result.push(queue[0] || -1);
      break;

    case "back":
      result.push(queue[queue.length - 1] || -1);
      break;

    default:
      queue.push(Number(input[i].split(" ")[1]));
      break;
  }
}
console.log(result.join("\n"));

// 문제 : https://www.acmicpc.net/problem/10845
