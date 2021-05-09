package com.hackerrank.algorithms.warmup;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a+b;
    }

    public static void main(String[] args) {
        Map<Map.Entry<Integer, Integer>, Integer> cases = new HashMap<>();
        cases.put(new AbstractMap.SimpleEntry<>(7, 3), 10);
        cases.forEach((in, exp) -> {
            long out = SolveMeFirst.solveMeFirst(in.getKey(), in.getValue());
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}