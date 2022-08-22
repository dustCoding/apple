package week01;

import java.util.Scanner;
import java.util.Stack;

public class Q_10828 {

	public static void main(String[] args) {

		//첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
		//둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
		//주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
		//문제에 나와있지 않은 명령이 주어지는 경우는 없다.
		
		Scanner sc = new Scanner(System.in);
		//1개 이상의 문자열을 더해주기 위해 사용
		StringBuilder sb = new StringBuilder();
		//Stack 선언
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = sc.nextInt();
		
		//입력받은 N 만큼 for문 반복
		for(int i=0;i<N;i++) {
			
			//입력한 type에 따라 switch문 작동
			String type = sc.next();
			
			switch (type) {
			
			//push X: 정수 X를 스택에 넣는 연산이다.
			case "push":
				stack.push(sc.nextInt());
				break;
				
			//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
			//     만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.	
			case "pop":
				if(stack.isEmpty())
					sb.append("-1").append("\n");
				else{
					sb.append(stack.peek()).append("\n");
					stack.pop();
				}
				break;
				
			//size: 스택에 들어있는 정수의 개수를 출력한다.	
			case "size":
				sb.append(stack.size()).append("\n");
				break;
				
			//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.	
			case "empty":
				if(stack.isEmpty())
					sb.append("1").append("\n");
				else
					sb.append("0").append("\n");
				break;
				
			//top: 스택의 가장 위에 있는 정수를 출력한다. 	
			//     만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			case "top":
				if(stack.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(stack.peek()).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
}