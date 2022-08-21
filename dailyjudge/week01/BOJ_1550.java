package dailyjudge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String hex_num = sc.next();
		
		System.out.println(Integer.parseInt(hex_num, 16));
	}
}
