package week01;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_10845 {

	public static void main(String[] args) {

		//첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
		//둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
		//주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
		//문제에 나와있지 않은 명령이 주어지는 경우는 없다.
		
		Scanner sc = new Scanner(System.in);
		//1개 이상의 문자열을 더해주기 위해 사용
		StringBuilder sb = new StringBuilder();
		//Queue는 ArrayList로 선언해줘야함
		ArrayList<Integer> que = new ArrayList<Integer>();
		
		int N = sc.nextInt();
		
		//입력받은 N 만큼 for문 반복
		for(int i=0;i<N;i++) {
			
			//입력한 type에 따라 switch문 작동
			String type = sc.next();
			
			switch (type) {
			
			//push X: 정수 X를 큐에 넣는 연산이다.
			case "push":
				que.add(sc.nextInt());
				break;
				
			//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 
			//     만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.	
			case "pop":
				if(que.isEmpty())
					sb.append("-1").append("\n");
				else {
					sb.append(que.get(0)).append("\n");
					que.remove(0);
				}
				break;
			
			//size: 큐에 들어있는 정수의 개수를 출력한다.		
			case "size":
				sb.append(que.size()).append("\n");
				break;
				
			//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.	
			case "empty":
				if(que.isEmpty())
					sb.append("1").append("\n");
				else
					sb.append("0").append("\n");
				break;
			
			//front: 큐의 가장 앞에 있는 정수를 출력한다. 
			//       만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			case "front":
				if(que.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(que.get(0)).append("\n");
				break;
				
			//back: 큐의 가장 뒤에 있는 정수를 출력한다. 
			//      만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.	
			case "back":
				if(que.isEmpty())
					sb.append("-1").append("\n");
				else
					sb.append(que.get(que.size()-1)).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
}