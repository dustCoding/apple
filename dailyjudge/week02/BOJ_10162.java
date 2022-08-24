package dailyjudge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int time[] = {300, 60, 10};
		
		int T = sc.nextInt();
		
		for(int i = 0; i < time.length; i++) {
			sb.append(T / time[i]).append(' ');
			T %= time[i];
		}
		
		if (T > 0) {
			System.out.println("-1");
		} else {
			System.out.println(sb.toString());
		}
		
	}

}
