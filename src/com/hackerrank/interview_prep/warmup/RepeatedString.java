package com.hackerrank.interview_prep.warmup;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

class RepeatedStringResult {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        long repetitions = n / s.length();
        long reminderLength = n % s.length();
        return countA(s) * repetitions + countA(s.substring(0, (int)reminderLength));
    }

    private static long countA(String s) {
        return s.chars().filter(c -> c == 'a').count();
    }

}

public class RepeatedString {
    public static void main(String[] args) {
        Map<Map.Entry<String, Long>, Long> cases = new HashMap<>();
        cases.put(new AbstractMap.SimpleEntry<>("abcac", 10L), 4L);
        cases.put(new AbstractMap.SimpleEntry<>("aba", 10L), 7L);
        cases.put(new AbstractMap.SimpleEntry<>("a", 1000000000000L), 1000000000000L);
        cases.forEach((in, exp) -> {
            long out = RepeatedStringResult.repeatedString(in.getKey(), in.getValue());
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}