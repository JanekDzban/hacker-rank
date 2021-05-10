package com.hackerrank.interview_prep.arrays;

import java.util.*;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        List<Long> values = new ArrayList<>(Collections.nCopies(n, 0L));
        long max = 0;
        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
            for (int j = a - 1; j < b; j++) {
                values.set(j, values.get(j) + k);
                max = Math.max(max, values.get(j));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Map<List<List<Integer>>, Long> cases = new LinkedHashMap<>();
        cases.put(Arrays.asList(
                Arrays.asList(1,5,3),
                Arrays.asList(4,8,7),
                Arrays.asList(6,9,1)), 10L);
        cases.put(Arrays.asList(
                Arrays.asList(1,2,100),
                Arrays.asList(2,5,100),
                Arrays.asList(3,4,100)), 200L);
        cases.forEach((in, exp) -> {
            int n = in.stream()
                    .map(list -> Arrays.asList(list.get(0), list.get(1)))
                    .flatMap(List::stream)
                    .mapToInt(i -> i)
                    .max()
                    .orElse(0);
            long out = arrayManipulation(n, in);
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}
