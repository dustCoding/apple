package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class cote1 {
    public static void test1550() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();

        System.out.println("hex: " + hex);

        int decimal = Integer.parseInt(hex, 16);
        System.out.println("decimal: " + decimal);
    }

    public static void test10872() {
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

        for(int i=0; i<N-1; i++){
            char[] fileName = br.readLine().toCharArray();
            for(int j=0; j<pattern.length; j++){
                if(pattern[j] != fileName[j]) {
                    pattern[j] = '?';
                }
            }
        }
        System.out.println(pattern);

    }

    public static void test10828() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<num; i++){
            String str = sc.next();

            switch (str){
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    if(!stack.empty()) {
                        sb.append(stack.pop()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(!stack.empty()) {
                        sb.append(0).append("\n");
                    }else {
                        sb.append(1).append("\n");
                    }
                    break;
                case "top":
                    if(!stack.empty()) {
                        sb.append(stack.peek()).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;

            }
        }
        System.out.println(sb);
    }

    public static void test10845() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for(int i=0; i<num; i++){
            String str = sc.next();

            switch (str){
                case "push" :
                    queue.offer(sc.nextInt());
                    break;
                case "pop" :
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back" :
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }
        System.out.println(sb);

    }
}
