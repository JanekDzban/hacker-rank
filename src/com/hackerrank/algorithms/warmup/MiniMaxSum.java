package com.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.stream().mapToLong(f -> f).min().orElse(0);
        long max = arr.stream().mapToLong(f -> f).max().orElse(0);
        long sum = arr.stream().mapToLong(f -> f).sum();
        System.out.printf("%d %d %n", sum - max,sum - min);
    }

    public static void main(String[] args) {
        Map<List<Integer>, String> cases = new LinkedHashMap<>();
        cases.put(Arrays.asList(1,3,5,7,9), "16 24");
        cases.put(Arrays.asList(1,2,3,4,5), "10 14");

        cases.forEach((in, exp) -> {
            System.out.printf("input: %s expected: %s output: ", in, exp);
            miniMaxSum(in);
        });
    }
}
