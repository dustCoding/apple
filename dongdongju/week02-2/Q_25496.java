package week2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_25496 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int P = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		for(int i=0;i<N;i++) {
			
			if(P<200) {
				P += A[i];
				cnt++;
				if(P>200)
					break;
			}
		}
		System.out.println(cnt);
	}
}