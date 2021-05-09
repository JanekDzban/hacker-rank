package com.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SimpleArraySumResult {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        return ar.stream().reduce(Integer::sum).orElse(0);
    }

}

public class SimpleArraySum {
    public static void main(String[] args) {
        Map<List<Integer>, Integer> cases = new HashMap<>();
        cases.put(Arrays.asList(1,2,3,4,10,11), 31);
        cases.forEach((in, exp) -> {
            int out = SimpleArraySumResult.simpleArraySum(in);
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}