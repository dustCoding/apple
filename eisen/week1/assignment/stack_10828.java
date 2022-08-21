package com.Eisen.daily.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : stack_10828
 * author :  eisen
 * date : 2022/08/21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/21                eisen             최초 생성
 */
public class stack_10828 {

    private static Stack<Integer> storage = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = br.readLine()) != null){
            int result = processCommand(line);
            if((!Pattern.matches("[0-9]*$", line)) && (result != Integer.MIN_VALUE) )
                System.out.println(result);
        }

        // 이건 왜 안되는거지?
        br.lines()
            .filter(e -> !Pattern.matches("[0-9]*$", e))
            .map(e -> processCommand(e))
            .filter(e -> e != Integer.MIN_VALUE)
            .peek(e -> System.out.println(e))
            .toString();
    }

    public static int processCommand(String command){
        int num = 0;
        if(command.contains("push")){
            num = Integer.parseInt(command.substring(5, command.length()));
            command = "push";
        }
        switch (command){
            case "push":
                storage.push(num);
                return Integer.MIN_VALUE;
            case "pop":
                try{
                    return storage.pop();
                }catch (EmptyStackException e){
                    return -1;
                }
            case "size":
                return storage.size();
            case "empty":
                return storage.empty() ? 1 : 0;
            case "top":
                try{
                    return storage.lastElement();
                }catch (NoSuchElementException e){
                    return -1;
                }
            default: return -1;
        }
    }
}
