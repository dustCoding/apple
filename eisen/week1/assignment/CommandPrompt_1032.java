package com.Eisen.daily.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : CommandPrompt_1032
 * author :  eisen
 * date : 2022/08/20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/20                eisen             최초 생성
 */
public class CommandPrompt_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        List<String> input = new ArrayList<>();

        while(br.ready()){
            input.add(br.readLine());
        }

//        br.lines().forEach(line -> System.out.println("line = " + line));

        if(input.size() < 2){
            System.out.println(input.get(1));
        }else{
            char[] temp = input.get(1).toCharArray();
            for (int i = 2; i < input.size(); i++) {
                char[] current = input.get(i).toCharArray();
                for (int j = 0; j < temp.length; j++) {
                    if(temp[j] != current[j]){
                        temp[j] = '?';
                    }
                }
            }
            for (char c : temp) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
