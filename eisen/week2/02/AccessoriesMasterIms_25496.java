package com.Eisen.daily.study.baekjoon.week03;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * packageName :  com.Eisen.daily.study.baekjoon.week03
 * fileName : AccessoriesMasterIms
 * author :  eisen
 * date : 2022/08/27
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/27                eisen             최초 생성
 */
public class AccessoriesMasterIms_25496 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        new AccessoriesMasterIms_25496().scanTemplate();
        bw.flush();
        bw.close();
        br.close();
    }

    void scanTemplate() throws IOException {
        // input
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fatigueRate = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        // logic
        ArrayList<Integer> list = new ArrayList<>();
        while(st.countTokens() != 0){
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.naturalOrder());
        int cnt = 0;
        for (int s : list) {
            if(fatigueRate < 200){
                fatigueRate += s;
                cnt++;
            }else{
                break;
            }
        }

        // output
        println(cnt);
    }

    void println(int answer) throws IOException {
        println(String.valueOf(answer));
    }
    void println(String answer) throws IOException {
        bw.write(answer);
    }
}
