package week2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class cote3 {
    public static void accessories() {
        // 제작 시스템으로 장신구를 제작 --> N
        // 장신구 제작 : 피로도 < 200
        // 피로도 누적 : A 제곱
        // P += A
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int P = sc.nextInt();
        int N = sc.nextInt();
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<N; i++){
            int A = sc2.nextInt();
            arr.add(A);
        }
        Collections.sort(arr);
        for(int i=0; i<N; i++){
            if(P < 200) {
                P += arr.get(i);
                result += 1;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        accessories();
    }
}
