package com.Eisen.daily.study.baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Cow3_14469 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arrive = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            list.add(new int[]{arrive, time});
        }
        list.sort(Comparator.comparingInt(arr -> arr[0]));

        int time = 0;
        for (int[] ints : list) {
            time = Math.max(time, ints[0]);
            time += ints[1];
        }

        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
        br.close();
    }
}
