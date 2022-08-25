package dailyjudge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int N = sc.nextInt();
		
		int list[] = new int[N];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		Arrays.sort(list);
		
		int cnt = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(P >= 200) {
				break;
			} else {
				P += list[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
