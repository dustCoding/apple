package week01;

import java.util.Scanner;

public class Q_1032 {

	public static void main(String[] args) {

		/*
		첫째 줄에 파일 이름의 개수 N이 주어진다. 
		둘째 줄부터 N개의 줄에는 파일 이름이 주어진다. 
		N은 50보다 작거나 같은 자연수이고 파일 이름의 길이는 모두 같고 길이는 최대 50이다. 
		파일이름은 알파벳 소문자와 '.' 로만 이루어져 있다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] fName = new String[N];
		
		for(int i=0;i<N;i++) {
			fName[i] = sc.next();
		}
		
		boolean flag;
		
		for(int i=0;i<fName[0].length();i++) {
			flag=false;
			for(int j=0;j<N-1;j++) {
				if(fName[j].charAt(i)!=fName[j+1].charAt(i)) {
					flag=true;
					break;
				}
			}
			
			if(flag)
				System.out.print("?");
			else
				System.out.print(fName[0].charAt(i));
		}
	}
}
