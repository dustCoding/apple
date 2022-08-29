package week2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q_15720 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int B = Integer.parseInt(st.nextToken()); 
		int C = Integer.parseInt(st.nextToken()); 
		int D = Integer.parseInt(st.nextToken()); 
	
		Integer[] Buger = new Integer[B];
		Integer[] Side = new Integer[C];
		Integer[] Drink = new Integer[D];
		
		int totalPrice = 0;
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<Buger.length;i++) {
			Buger[i] = Integer.parseInt(st.nextToken());
			totalPrice += Buger[i];
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<Side.length;i++) {
			Side[i] = Integer.parseInt(st.nextToken());
			totalPrice += Side[i];
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<Drink.length;i++) {
			Drink[i] = Integer.parseInt(st.nextToken());
			totalPrice += Drink[i];
		}
		
		System.out.println(totalPrice);
		
		Arrays.sort(Buger, Collections.reverseOrder());
		Arrays.sort(Side, Collections.reverseOrder());
		Arrays.sort(Drink, Collections.reverseOrder());	
		
		int min_setmenu = B < C ? B : C;
			min_setmenu = min_setmenu < D ? min_setmenu : D;
		
		int discountPrice = 0;
		for(int i=0;i<min_setmenu;i++) {
			discountPrice += (Buger[i] + Side[i] + Drink[i]) * 0.9;
		}	
		
		for(int i=min_setmenu;i<Buger.length;i++) { 
			discountPrice += Buger[i]; 
			}
		for(int i=min_setmenu;i<Side.length;i++) { 
			discountPrice += Side[i]; 
			}
		for(int i=min_setmenu;i<Drink.length;i++) { 
			discountPrice += Drink[i]; 
			}
		
		System.out.println(discountPrice);
	}
}