package dailyjudge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String result = "";
		String name[] = new String[N];
		
		
		for(int i = 0; i < N; i++) {
			name[i] = sc.next();
		}
		
		for(int i = 0; i < name[0].length(); i++) {
			char target = name[0].charAt(i);
			boolean isSame = true;
			
			for(int j = 0; j < N; j++) {
				if(target != name[j].charAt(i)) {
					isSame = false;
					break;
				}
			}
			
			result += isSame ? target : "?";
		}
		
		System.out.println(result);
	}
}
