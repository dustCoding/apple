package week3;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class cote5 {
    static Scanner sc = new Scanner(System.in);

    // [24479] DFS (BFS에 비해 검색 속도는 떨어지지만 간단함.)
    public static void DFS(int N, int M, int R) {
        LinkedList<Integer> list[] = new LinkedList[N+1];
        for (int i=0; i<=N; i++){
            list[i] = new LinkedList<Integer>();
        }
        for (int i=0; i<M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list[u].add(v);
            list[v].add(u);
        }
        for (int i=0; i<=N; i++) Collections.sort(list[i]);

        Stack<Integer> stack = new Stack<>();
        Boolean visit[] = new Boolean[N+1];
        visit[R] = true;
        stack.push(R);

        while(!stack.isEmpty()) {
            int x = stack.pop();
            System.out.print(x+" ");
            if(visit[x]) {
                continue;
            }
            for (int i : list[x]){
                if (!visit[i]) {
                    visit[i] = true;
                    stack.push(i);
                }
            }
        }


    }

    // [24444] BFS
    public static void BFS(int N, int M, int R) {
        LinkedList<Integer> list[] = new LinkedList[N+1];
        for (int i=0; i<=N; i++){
            list[i] = new LinkedList<Integer>();
        }
        for (int i=0; i<M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list[u].add(v);
            list[v].add(u);
        }

        for (int i=0; i<=N; i++) {
            Collections.sort(list[i]);
        }
        // 방문처리 : queue에 한번 삽입된 노드가 다시 삽입되지 않게 체크하기 위함.
        boolean visited[] = new boolean[N+1];
        // BFS는 보통 Queue 사용
        Queue<Integer> queue = new LinkedList<>();
        // 첫 노드 입력
        visited[R] = true;
        queue.add(R); // R = 1
        // Queue가 비어있을때까지 반복
        while (!queue.isEmpty()) {
            // 넣어준 노드 꺼내서 출력
            int x = queue.poll();
            System.out.print(x+" ");
            // 방문한 노드와 인접한 노드 가져오기
            Iterator<Integer> iterator = list[x].listIterator();
            while (iterator.hasNext()) {
                int i = iterator.next();
                if (!visited[i]) {
                    // 방문하지 않은 노드 체크 후 Queue 삽입
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        int N = sc.nextInt(); // 정점의 수
        int M = sc.nextInt(); // 간선의 수
        int R = sc.nextInt(); // 시작 정점점

        System.out.println("------BFS-------");
        BFS(N, M, R);
        System.out.println("------DFS-------");
        DFS(N, M, R);
    }
}
