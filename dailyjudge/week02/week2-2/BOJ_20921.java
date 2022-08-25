package dailyjudge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int num[] = new int[N];
		
		//1부터 N 숫자 넣기
		for(int i = 0; i < N; i++) {
			num[i] = i + 1;
		}
		
		//어색한 친구 사이의 개수
		int cnt = 0;
		
		// i : ~까지 swap할 수 있도록 제한
		// j : ~까지 swap하는 기능 구현
		for(int i = 1; i < N; i++) {
			if(cnt == K) break;
			for(int j = N - 1; j > i - 1; j--) {
				
				//swap
				int temp;
				temp = num[j];
				num[j] = num[j-1];
				num[j - 1] = temp;
				
				cnt++;

				if(cnt == K) break;
			}
			if(cnt == K) break;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
