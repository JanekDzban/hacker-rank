package com.hackerrank.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaIfElse {

    public static void weirdOrNot(int N) {
        String answer = "Weird";
        String not = "Not ";

        if(N % 2 == 0) {
            if ((N >= 2 && N <= 5) || N > 20) {
                answer = not + answer;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Map<Integer, String> cases = new LinkedHashMap<>();
        cases.put(3, "Weird");
        cases.put(24, "Not Weird");
        cases.forEach((in, exp) -> {
            System.out.printf("input: %s expected: %s output: ", in, exp);
            weirdOrNot(in);
        });
    }
}
