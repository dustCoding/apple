package dailyjudge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean visited[] = new boolean[N + 1];
		int parent[] = new int[N + 1];
		
		List<Integer> list[] = new ArrayList [N+1];
		
		for(int i = 0 ; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i <  N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(list[i]);
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		visited[1] = true;
		
		while(!q.isEmpty()) {
			int targetNum = q.poll();
			for(int i = 0; i < list[targetNum].size(); i++) {
				int k = list[targetNum].get(i);
				if(!visited[k]) {
					q.add(k);
					visited[k] = true;
					parent[k] = targetNum;
				}
			}
		}

		for(int i = 2; i <= N; i++) {
			System.out.println(parent[i]);
		}
	}
}
