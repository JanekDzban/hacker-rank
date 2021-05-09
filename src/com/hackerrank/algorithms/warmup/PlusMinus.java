package com.hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(Integer i : arr) {
            if(i > 0) {
                positive++;
            } else if(i < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        double n = arr.size();
        System.out.printf("%f%n%f%n%f%n", positive/n, negative/n, zero/n);
    }

}

public class PlusMinus {
    public static void main(String[] args) {
        Map<List<Integer>, List<Double>> cases = new HashMap<>();
        cases.put(Arrays.asList(1,1,0,-1,-1), Arrays.asList(0.4,0.4,0.2));
        cases.put(Arrays.asList(-4,3,-9,0,4,1), Arrays.asList(0.5,0.333333,0.166667));
        cases.forEach((in, exp) -> {
            PlusMinusResult.plusMinus(in);
            System.out.printf("input: %s expected: %s%n", in, exp);
        });
    }
}