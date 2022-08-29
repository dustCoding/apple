package dailyjudge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 6 K일 때?
	// 1 4 6 7 12 16 이라고 하면
	// 3 2 1 5 4 차이.
	// K = 1이면 16 - 1 = 15 (차이의 모든 값을 다 더한 것과 같음)
	// K = 2이면 (1 4 6 7) (12 16) 6 + 4 = 10 최대 > 가장 큰 차이가 나는 지점을 가른다.
	// -> 차이의 모든 값 중 가장 큰 값만을 제외하고 더한다.
	// K = 3이면 (1 4 6 7) (12) (16) 6 + 0 + 0 = 6 최대 > 가장 큰 차이가 나는 두 지점을 가른다.
	// -> 차이의 모든 값 중 가장 큰 2개의 값만을 제외하고 더한다.
	// K = 4이면 (1) (4 6 7) (12) (16) 0 + 3 + 0 + 0 = 3 최대 > 가장 큰 차이가 나는 세 지점을 가른다.
	// -> 차이의 모든 값 중 가장 큰 3개의 값만을 제외하고 더한다.
	// K = 5이면 (1) (4) (6 7) (12) (16) 0 + 0 + 1 + 0 + 0 = 1 최대 > 가장 큰 차이가 나는 네 지점을 가른다.
	// -> 차이의 모든 값 중 가장 큰 4개의 값만을 제외하고 더한다.
	
	// 3 2 1 5 4일 때,
	// 오름차순 정렬 -> 1 2 3 4 5
	// 오름차순 정렬된 식을 (N-K) 개수만큼 더해준다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int height[] = new int[N]; // 원생의 키를 담을 배열
		
		for(int i = 0; i < N; i++) {
			height[i] = sc.nextInt();
		}
		
		int distance[] = new int[N - 1]; // 인접한 원생과의 키 차이를 담을 배열
		
		for(int i = 0; i < N - 1; i++) {
			distance[i] = height[i + 1] - height[i];
		}
		
		Arrays.sort(distance); // 키차이 오름차순 정렬 (가르는 포인트 정하기)
		
		int result = 0;
		
		for(int i = 0; i < N - K; i++) {
			result += distance[i];
		}
		
		System.out.println(result);
	}

}
