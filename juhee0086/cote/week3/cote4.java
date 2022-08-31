package week3;

import java.util.*;

public class cote4 {
    // 이진트리아니고 걍 그래프
    public static void bfs(int root) {



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        // node의 개수
        int N = sc.nextInt();
        // 루트는 1
        int root = 1;
        // 그래프
        List<Integer> list[] = new ArrayList[N+1];
        for (int i=0; i<list.length; i++){
            list[i] = new ArrayList<Integer>();
        }
        // 그래프 입력
        for (int i=0; i<N-1; i++){
            int parent = sc2.nextInt();
            int child = sc2.nextInt();
            list[parent].add(child);
            list[child].add(parent);
        }
        // edge 확인
        boolean edge[] = new boolean[N+1];
        int result[] = new int[N+1];
        // 너비우선탐색 --> 큐
        Queue<Integer> queue = new LinkedList<Integer>();
        // 시작 노드 저장
        queue.add(root);
        edge[root] = true;

        while(!queue.isEmpty()) {
            // queue에서 꺼내기
            int x = queue.poll();
            for (int i : list[x]){
                // 방문 x
                if(!edge[i]) {
                    queue.add(i);
                    edge[i] = true;
                    result[i] = x;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=2; i<result.length; i++) {
            sb.append(result[i]+"\n");
        }
        System.out.println(sb);
    }

}
