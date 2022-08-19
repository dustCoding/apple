package juhee0086.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class cote {
    public static void test1550() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();

        System.out.println("hex: " + hex);

        int decimal = Integer.parseInt(hex, 16);
        System.out.println("decimal: " + decimal);
    }

    public static void test10872() throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int sum = 1;
        while(N != 0){
            sum = sum * N;
            N --;
        }

        System.out.print("result: " + sum);
    }

    public static void test1032() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] pattern = br.readLine().toCharArray();

        for(int i=0; i<N; i++){
            char[] fileName = br.readLine().toCharArray();
            for(int j=0; j<pattern.length; j++){
                if(pattern[j] != fileName[j]) {
                    pattern[j] = '?';
                }
            }
        }
        System.out.println("result : " + pattern);

    }

    public static void test10828() {
        Scanner sc = new Scanner(System.in);



    }

    public static void test10845() {
        Scanner sc = new Scanner(System.in);



    }

}
