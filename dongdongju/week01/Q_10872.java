package week01;

import java.util.Scanner;

public class Q_10872 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		System.out.println(fact(input));
	}
	
	public static int fact(int input) {
		
		if(input<=0) 
			return input+1;
		else 
			return fact(input-1)*input;
	}
}