import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_14469 {
	
	static class Cow implements Comparable<Cow> {
		int arriveTime;
		int checkTime;
		
		public Cow(int arriveTime, int checkTime) {
			this.arriveTime = arriveTime;
			this.checkTime = checkTime;
		}
		
		public int compareTo(Cow cow) {
			return this.arriveTime - cow.arriveTime;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Cow[] cow = new Cow[N];
		
		for(int i=0;i<N;i++) { 
			
			st = new StringTokenizer(br.readLine()," ");
			
			int arrive = Integer.parseInt(st.nextToken()); 
			int check = Integer.parseInt(st.nextToken());
		    
			cow[i] = new Cow(arrive,check);
		}
		
		Arrays.sort(cow);
		
		int time = cow[0].arriveTime;
		for(int i=0;i<N;i++) {
			if(time<cow[i].arriveTime)
				time=cow[i].arriveTime;
			
			time = time + cow[i].checkTime;
		}
		System.out.println(time);
	}
}