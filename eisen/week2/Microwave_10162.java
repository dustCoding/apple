package com.Eisen.daily.study.baekjoon;

import java.io.*;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : Microwave_10162
 * author :  eisen
 * date : 2022/08/22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/22                eisen             최초 생성
 */
public class Microwave_10162 {
//    여러분은 T초를 위한 최소버튼 조작의 A B C 횟수를 첫 줄에 차례대로 출력해야 한다.
//    각각의 횟수 사이에는 빈 칸을 둔다.
//    해당 버튼을 누르지 않는 경우에는 숫자 0을 출력해야한다.
//    만일 제시된 3개의 버튼으로 T초를 맞출 수 없으면 음수 -1을 첫 줄에 출력해야 한다.
    // A = 5분
    // B = 1분
    // C = 10초
    private final static int A = 300;
    private final static int B = 60;
    private final static int C = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = "";
        while((line = br.readLine()) != null){
            System.out.println(calMinimumCnt(line));
        }
        br.close();
    }

    private static String calMinimumCnt(String e) {
        int input = Integer.parseInt(e);
        int temp = 0;
        StringBuffer sb = new StringBuffer();
        if(input % 10 != 0){
            return "-1";
        }
        if(input >= A){
            temp = input / A;
            input = input % A;
            sb.append(temp);
        }else{
            sb.append(0);
        }
        sb.append(" ");
        if(input >= B){
            temp = input / B;
            input = input % B;
            sb.append(temp);
        }else{
            sb.append(0);
        }
        sb.append(" ");
        if (input >= C){
            temp = input / C;
            input = input % C;
            sb.append(temp);
        }else{
            sb.append(0);
        }
        return sb.toString();
    }
}
