package dailyjudge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> queue = new ArrayList<>();
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			
			switch (str) {
			
			case "push":
				queue.add(sc.nextInt());
				break;
				
			case "pop":
				if(queue.isEmpty()) {
					sb.append("-1").append('\n');
				} else {
					sb.append(queue.get(0)).append('\n');
					queue.remove(0);
				}			
				break;
				
			case "size":
				sb.append(queue.size()).append('\n');
				break;
			
			case "empty":
				if(queue.isEmpty()) {
					sb.append("1").append('\n');
				} else {
					sb.append("0").append('\n');
				}
				break;
				
			case "front":
				if(queue.isEmpty()) {
					sb.append("-1").append('\n');
				} else {
					sb.append(queue.get(0)).append('\n');
				}
				break;
			case "back":
				if(queue.isEmpty()) {
					sb.append("-1").append('\n');
				} else {
					sb.append(queue.get(queue.size() - 1)).append('\n');
				}
				break;
			}
						
		}
		
		System.out.println(sb.toString());
	}

}
