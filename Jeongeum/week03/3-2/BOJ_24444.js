// 너비 우선 탐색 1 : https://www.acmicpc.net/problem/24444

/* dev/stdin */
let input = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n");

let [N, M, R] = input
  .shift()
  .split(" ")
  .map((x) => Number(x));

let graph = [...Array(N + 1)].map(() => []);
let visited = Array(N + 1).fill(0);
visited[R] = 1;
let node = 1;
let queue = [R];

// 양방향 간선 생성

for (let i = 0; i < M; i++) {
  let [u, v] = input[i].split(" ").map(Number);
  graph[u].push(v);
  graph[v].push(u);
}

// 인접 정점 번호 오름차순 정렬
graph.forEach((element) => {
  element.sort((a, b) => a - b);
});

while (queue.length !== 0) {
  let tmp = queue.shift();
  for (let i of graph[tmp]) {
    if (visited[i]) {
      continue;
    } else {
      node += 1;
      visited[i] = node;
      queue.push(i);
    }
  }
}

console.log(visited.slice(1).join("\n"));
