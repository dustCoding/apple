package dailyjudge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int burgerCount = sc.nextInt();
		int sideMenuCount = sc.nextInt();
		int beverageCount = sc.nextInt();
		
		int burgerPrice[] = new int[burgerCount];
		int sideMenuPrice[] = new int[sideMenuCount];
		int beveragePrice[] = new int[beverageCount];
		
		int before_price = 0;
		int after_price;
		for(int i = 0; i < burgerCount; i++) {
			burgerPrice[i] = sc.nextInt();
			before_price += burgerPrice[i];
		}
		
		for(int i = 0; i < sideMenuCount; i++) {
			sideMenuPrice[i] = sc.nextInt();
			before_price += sideMenuPrice[i];
		}
		
		for(int i = 0; i < beverageCount; i++) {
			beveragePrice[i] = sc.nextInt();
			before_price += beveragePrice[i];
		}
		
		// 오름차순 정렬
		Arrays.sort(burgerPrice);
		Arrays.sort(sideMenuPrice);
		Arrays.sort(beveragePrice);
		
		
		// 가장 최저의 값 찾기
		int min_value = burgerCount < sideMenuCount ? burgerCount : sideMenuCount;
		min_value = min_value < beverageCount ? min_value : beverageCount;
		
		System.out.println(before_price);
		int discounted_price = before_price;
		for(int i = 0; i < min_value; i++) {
			if(burgerPrice[burgerCount - i - 1] != 0 && sideMenuPrice[sideMenuCount - i - 1] != 0 && beveragePrice[beverageCount - i - 1] != 0) {
				discounted_price -= (burgerPrice[burgerCount - i - 1] + sideMenuPrice[sideMenuCount - i - 1] + beveragePrice[beverageCount - i - 1]) * 0.1;
			}
		}
		
		System.out.println(discounted_price);
	}
}
