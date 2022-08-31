// 트리의 부모 찾기 : https://www.acmicpc.net/problem/11725
// 시간 초과

/* dev/stdin */
let input = require("fs")
  .readFileSync("example.txt")
  .toString()
  .trim()
  .split("\n");

// 노드의 개수
const N = +input.shift();

// 노드의 개수만큼의 크기를 가진 tree 배열을 생성한다.
// 연결된 두 정점들을 edges 배열에 넣어준다.
// 연결 된 노드들의 값을 tree 배열에 넣어준다.
const tree = [...Array(N + 1)].map(() => []);
const edges = input.map((x) => x.split(" ").map(Number));

edges.forEach(([a, b]) => {
  tree[a].push(b);
  tree[b].push(a);
});

// for문을 돌면서 노드를 돌면서 방문 처리해서 visited 배열에 true 값을 주고 stack에 넣는다.
// 부모의 노드를 parent 배열에 넣어준다.
let visited = Array(N + 1).fill(false);
let stack = [1];
let parent = new Array(N + 1);

while (stack.length !== 0) {
  let tmp = stack.shift();
  for (let i of tree[tmp]) {
    if (visited[i] === false) {
      visited[i] = true;
      parent[i] = tmp; //parent[i] 의 부모는 tmp이다
      stack.push(i);
    }
  }
}

// 2부터 for문 돌면서 부모 노드를 출력한다.
for (let i = 2; i < N + 1; i++) {
  console.log(parent[i]);
}
