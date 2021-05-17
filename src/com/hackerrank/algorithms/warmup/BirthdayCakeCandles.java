package com.hackerrank.algorithms.warmup;

import java.util.*;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        return (int) candles.stream()
                .filter(i -> i.equals(max))
                .count();
    }

    public static void main(String[] args) {
        Map<List<Integer>, Integer> cases = new LinkedHashMap<>();
        cases.put(Arrays.asList(4,4,1,3), 2);
        cases.put(Arrays.asList(3,2,1,3), 2);

        cases.forEach((in, exp) -> {
            int out = birthdayCakeCandles(in);
            System.out.printf("input: %s expected: %s output: %s %n", in, exp, out);
        });
    }
}
