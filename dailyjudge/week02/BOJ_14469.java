package dailyjudge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int check[][] = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			check[i][0] = sc.nextInt();
			check[i][1] = sc.nextInt();
		}
		
		Arrays.sort(check, new Comparator<int []>() {
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		int time = 0;
		
		for(int i = 0 ; i < N; i++) {
			time = time < check[i][0] ? check[i][0] : time;
			time += check[i][1];
		}
		System.out.println(time);
	}

}
