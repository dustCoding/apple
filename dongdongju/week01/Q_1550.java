package week01;

import java.util.Scanner;

public class Q_1550 {

	public static void main(String[] args) {
		
		//첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.
		
		Scanner sc = new Scanner(System.in);
	
		String a = sc.next();
		
		System.out.println(Integer.parseInt(a,16));
	}
}