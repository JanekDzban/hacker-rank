package com.hackerrank.interview_prep.arrays;

import java.util.*;

class LeftRotationResult {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        int n = a.size();
        int boundary = d % n;
        List<Integer> rotated = new ArrayList<>(a.subList(boundary, n));
        rotated.addAll(a.subList(0, boundary));
        return rotated;
    }

}

public class LeftRotation {
    public static void main(String[] args) {
        Map<Map.Entry<List<Integer>, Integer>, List<Integer>> cases = new HashMap<>();
        cases.put(new AbstractMap.SimpleEntry<>(Arrays.asList(1,2,3,4,5), 2), Arrays.asList(3,4,5,1,2));
        cases.put(new AbstractMap.SimpleEntry<>(Arrays.asList(1,2,3,4,5), 4), Arrays.asList(5,1,2,3,4));
        cases.forEach((in, exp) -> {
            List<Integer> out = LeftRotationResult.rotLeft(in.getKey(), in.getValue());
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}