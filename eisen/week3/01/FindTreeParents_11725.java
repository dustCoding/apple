package com.Eisen.daily.study.baekjoon.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName :  com.Eisen.daily.study.baekjoon.week03
 * fileName : FindTreeParents_11725
 * author :  eisen
 * date : 2022/08/31
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/31                eisen             최초 생성
 */
public class FindTreeParents_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer>[] treeList = new ArrayList[N -1];
        int[] parentNode = new int[N-1];

        for (int i = 0; i < treeList.length; i++) {
            treeList[i] = new ArrayList<>();
        }

        while(br.ready()){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());
            treeList[firstNum].add(secondNum);
            treeList[secondNum].add(firstNum);
            
            while (st.countTokens() != 0){

            }

        }


    }
    public void findParent(){
//7
//1 6
//6 3
//3 5
//4 1
//2 4
//4 7
    }
}
