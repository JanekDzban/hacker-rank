package com.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CompareTheTripletsResult {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int pointsA = 0;
        int pointsB = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                pointsA++;
            } else if(a.get(i) < b.get(i)) {
                pointsB++;
            }
        }
        return Arrays.asList(pointsA, pointsB);
    }

}

public class CompareTheTriplets {
    public static void main(String[] args) {
        Map<List<List<Integer>>, List<Integer>> cases = new HashMap<>();
        cases.put(Arrays.asList(Arrays.asList(5,6,7), Arrays.asList(3,6,10)), Arrays.asList(1,1));
        cases.put(Arrays.asList(Arrays.asList(17,28,30), Arrays.asList(99,16,8)), Arrays.asList(2,1));
        cases.forEach((in, exp) -> {
            List<Integer> out = CompareTheTripletsResult.compareTriplets(in.get(0), in.get(1));
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}
