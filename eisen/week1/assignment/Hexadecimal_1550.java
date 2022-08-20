package com.Eisen.daily.study.baekjoon;

import java.io.*;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : Hexadecimal
 * author :  eisen
 * date : 2022/08/19
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/19                eisen             최초 생성
 */
public class Hexadecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        while(st.countTokens() != 0){
            sb.append(solution(st.nextToken()));
        }
        System.out.println(sb);
    }

    public static int solution(String str){
        AtomicInteger atom = new AtomicInteger();
        StringBuilder sb = new StringBuilder();
        for (char  a: str.toCharArray()) {
            sb.append(a);
        }
        sb.reverse();
        return sb.chars()
                .map(e -> {
                    int index = atom.getAndIncrement();
                    int firstNum = 0;
                    int secondNum = (int)Math.pow(16, index);
                    if(e == ('A')){
                        firstNum = 10;
                    }else if(e == ('B')){
                        firstNum = 11;
                    }else if(e == ('C')){
                        firstNum = 12;
                    }else if(e == ('D')){
                        firstNum = 13;
                    }else if(e == ('E')){
                        firstNum = 14;
                    }else if(e == ('F')){
                        firstNum = 15;
                    }else{
                        firstNum = Integer.parseInt(Character.toString(e));
                    }
                    return firstNum * secondNum;
                }).reduce(0, (o1, o2) -> o1 + o2);
    }
}

