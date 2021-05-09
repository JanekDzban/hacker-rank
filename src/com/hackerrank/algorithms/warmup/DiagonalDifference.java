package com.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DiagonalDifferenceResult {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0, n = arr.size(); i < n; i++) {
            sum += arr.get(i).get(i) - arr.get(i).get(n-1-i);
        }
        return Math.abs(sum);
    }

}

public class DiagonalDifference {
    public static void main(String[] args) {
        Map<List<List<Integer>>, Integer> cases = new HashMap<>();
        cases.put(Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(9,8,9)), 2);
        cases.put(Arrays.asList(
                Arrays.asList(11,2,4),
                Arrays.asList(4,5,6),
                Arrays.asList(10,8,-12)), 15);
        cases.forEach((in, exp) -> {
            int out = DiagonalDifferenceResult.diagonalDifference(in);
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}