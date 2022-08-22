package com.Eisen.daily.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.LongStream;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : Factorial
 * author :  eisen
 * date : 2022/08/20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/20                eisen             최초 생성
 */
public class Factorial_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
            LongStream.rangeClosed(1, Integer.parseInt(br.readLine()))
                .filter(e -> e != 0)
                .reduce((previous, current) -> previous * current)
                .orElse(1)
        );
    }
}
