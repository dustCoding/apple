import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_14469 {
	
	static class Cow {
		int arriveTime;
		int checkTime;
		
		public Cow(int arriveTime, int checkTime) {
			this.arriveTime = arriveTime;
			this.checkTime = checkTime;
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
		
	
	}
}