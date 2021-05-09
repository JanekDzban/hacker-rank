package com.hackerrank.algorithms.warmup;

import java.util.HashMap;
import java.util.Map;

class StaircaseResult {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for(int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            for(; j < n - i; j++) {
                sb.append(' ');
            }
            for(int k = 0; k < n - j; k++) {
                sb.append('#');
            }
            System.out.println(sb);
        }
    }

    public static void staircase2(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(
                    new String(new char[n - i]).replace("\0", " ") +
                    new String(new char[i]).replace("\0", "#")
            );
        }
    }
}

public class Staircase {
    public static void main(String[] args) {
        Map<Integer, String> cases = new HashMap<>();
        cases.put(4,
                "   #\n" +
                "  ##\n" +
                " ###\n" +
                "####");
        cases.put(6,
                "     #\n" +
                "    ##\n" +
                "   ###\n" +
                "  ####\n" +
                " #####\n" +
                "######");
        cases.forEach((in, exp) -> {
            StaircaseResult.staircase(in);
            System.out.printf("input: %s expected: %n%s%n", in, exp);
        });
        cases.forEach((in, exp) -> {
            StaircaseResult.staircase2(in);
            System.out.printf("input: %s expected: %n%s%n", in, exp);
        });
    }
}