package dailyjudge;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			long n = sc.nextLong();
			long m = sc.nextLong();
			
			long plusNumber = n + m;
			
			int day = 0;
			
			while(n > 0) {
				n /= 2;
				// 4 > 2 > (1 + 1) > 1 > 0
				// 2로 나누다가 1이 되면 먹이를 1씩 주면 2 - 1 - 2 -1 ... 반복 
				// 먹이 개수만큼 연명 가능
				day++;
			}
			
			System.out.println(day + m);
		}
	}
}
