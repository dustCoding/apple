import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10162 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] time = {300,60,10};
		int A=0,B=0,C=0;
		
		for(int i=0;i<time.length;i++) {
			
			int cnt = T/time[i];
			
			if(time[i]==time[0]) {
				T -= cnt * time[i];
				A += cnt;
			}else if(time[i]==time[1]) {
				T -= cnt * time[i];
				B += cnt;
			}else if(time[i]==time[2]) {
				T -= cnt * time[i];
				C += cnt;
			}	
		}
		if(T%10!=0)
			System.out.println("-1");		
		else
			System.out.println(A+" "+B+" "+C);		
	}
}