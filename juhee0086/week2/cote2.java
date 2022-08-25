package juhee0086.week2;

import java.util.Scanner;

public class cote2 {
    public static void Greedy() {
        // 버튼: A 5분, B 1분, C 10초 --> 최소 횟수
        // 요리해야할 시간: T

        Scanner sc = new Scanner(System.in);
        System.out.print("요리시간 : ");
        int T = sc.nextInt();
        int A = 300;
        int B = 60;
        int C = 10;
        int cnt = 0;
        int[] btn = new int[] {A,B,C};

        if(T%C != 0) {
            System.out.println(-1);
        }else {
            for(int time : btn) {
                cnt = T/time;
                T %= time;
                System.out.print(cnt);
                System.out.print(" ");
            }
        }
    }
}
