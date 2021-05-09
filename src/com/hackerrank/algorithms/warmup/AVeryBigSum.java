package com.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AVeryBigSumResult {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        return ar.stream().reduce(Long::sum).orElse(0L);
    }

}

public class AVeryBigSum {
    public static void main(String[] args) {
        Map<List<Long>, Long> cases = new HashMap<>();
        cases.put(Arrays.asList(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L), 5000000015L);
        cases.forEach((in, exp) -> {
            long out = AVeryBigSumResult.aVeryBigSum(in);
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}