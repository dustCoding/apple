package week3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer>[] list;
	static int[] parents;
	
	public static void dfs(int i) {
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] list = new ArrayList[N+1];
		int[] parents = new int[N+1];
		
		for(int i=0;i<N;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<N-1;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		}
		
		dfs();
		
		for(int i=2;i<=N;i++) {
			System.out.println(parents[i]);
		}

		
		
	}
}