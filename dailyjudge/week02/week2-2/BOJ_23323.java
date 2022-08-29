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
				// 2�� �����ٰ� 1�� �Ǹ� ���̸� 1�� �ָ� 2 - 1 - 2 -1 ... �ݺ� 
				// ���� ������ŭ ���� ����
				day++;
			}
			
			System.out.println(day + m);
		}
	}
}
