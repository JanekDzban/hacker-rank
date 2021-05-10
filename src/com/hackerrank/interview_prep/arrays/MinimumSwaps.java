package com.hackerrank.interview_prep.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinimumSwaps {

    public static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            arr[i]--;
        }

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] != i) {
                int j = i + 1;
                while(arr[j] != i) {
                    j++;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
            }
        }
        return swaps;
    }


    public static void main(String[] args) {
        Map<int[], Integer> cases = new LinkedHashMap<>();
        cases.put(new int[]{7,1,3,2,4,5,6}, 5);
        cases.put(new int[]{4,3,1,2}, 3);
        cases.put(new int[]{2,3,4,1,5}, 3);
        cases.put(new int[]{1,3,5,2,4,6,7}, 3);
        cases.forEach((in, exp) -> {
            int out = minimumSwaps(in);
            System.out.printf("input: %s expected: %s output: %s\n", Arrays.toString(in), exp, out);
        });
    }
}
