package com.Eisen.daily.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : Happy_13164
 * author :  eisen
 * date : 2022/08/24
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/24                eisen             최초 생성
 */
public class Happy_13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer firstSt = new StringTokenizer(line);
        int heads = Integer.parseInt(firstSt.nextToken());
        int groups = Integer.parseInt(firstSt.nextToken());

        StringTokenizer secondSt = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < heads; i++) {
            list.add(Integer.parseInt(secondSt.nextToken()));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = list.size()-1; i > 0; i--) {
            temp.add(list.get(i) - list.get(i-1));
        }
        temp.sort(Comparator.reverseOrder());
        int result = 0;
        for (int i = groups -1; i < temp.size(); i++) {
            result += temp.get(i);
        }
        System.out.println(result);
//        이건 왜 안되지?
//        for (int i = 0; i < groups -1; i++) {
//            temp.remove(i);
//        }
//        System.out.println(temp.stream().reduce(0, (e1, e2) -> e1+e2));
    }
}
