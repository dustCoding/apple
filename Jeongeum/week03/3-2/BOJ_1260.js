// DFS와 BFS : https://www.acmicpc.net/problem/1260

/* dev/stdin */
let input = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n");

let [N, M, V] = input
  .shift()
  .split(" ")
  .map((x) => Number(x));

let graph = [...Array(N + 1)].map(() => []);
let visited = Array(N + 1).fill(0);

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

// 깊이 우선 탐색
let result_dfs = [];
function DFS(V) {
  if (visited[V]) return;
  visited[V] = 1;
  result_dfs.push(V);
  for (let i = 0; i < graph[V].length; i++) {
    let next = graph[V][i];
    if (visited[next] === 0) {
      DFS(next);
    }
  }
}

// 너비 우선 탐색
function BFS(V) {
  let result_bfs = [];
  visited.fill(0);
  let queue = [V];
  while (queue.length !== 0) {
    let tmp = queue.shift();
    if (visited[tmp]) {
      continue;
    }
    visited[tmp] = true;
    result_bfs.push(tmp);
    for (let i = 0; i < graph[tmp].length; i++) {
      let next = graph[tmp][i];
      if (visited[next] === 0) {
        queue.push(next);
      }
    }
  }
  console.log(result_bfs.join(" "));
}

DFS(V);
console.log(result_dfs.join(" "));
BFS(V);
