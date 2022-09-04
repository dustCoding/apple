package week3;

import java.util.*;

public class cote5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

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
        boolean visited[] = new boolean[N+1];
        Queue<Integer> queue = new LinkedList<>();

        visited[R] = true;
        queue.add(R); // R = 1

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.println(x);
            // 방문한 노드와 인접한 노드 가져오기
            Iterator<Integer> iterator = list[x].listIterator();
            while (iterator.hasNext()) {
                int i = iterator.next();
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
