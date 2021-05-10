package com.hackerrank.interview_prep.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        int n = q.size();
        for(int i =0; i < n; i++) {
            int difference =  i + 1 - q.get(i);
            if(difference < -2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                int x = q.get(j);
                int y = q.get(j + 1);
                if(x > y) {
                    q.set(j, y);
                    q.set(j + 1, x);
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }

    public static void minimumBribes2(List<Integer> q) {
        int bribes = 0;
        int n = q.size();
        for(int i = n - 1; i >= 0; i--) {
            int currentBribes = q.get(i) - (i + 1);
            System.out.println(currentBribes);
            if(currentBribes > 0) {
                if(currentBribes > 2) {
                    System.out.println("Too chaotic");
                    return;
                } else {
                    bribes += currentBribes;
                }
            }
        }
        System.out.println(bribes);
    }

    public static void main(String[] args) {
        Map<List<Integer>, String> cases = new LinkedHashMap<>();
        cases.put(Arrays.asList(1,2,3,4,5,6,7,8), "0");
        cases.put(Arrays.asList(4,1,2,3), "Too chaotic");
        cases.put(Arrays.asList(2,1,5,3,4), "3");
        cases.put(Arrays.asList(2,5,1,3,4), "Too chaotic");

        cases.put(Arrays.asList(5,1,2,3,7,8,6,4), "Too chaotic");
        cases.put(Arrays.asList(1,2,5,3,7,8,6,4), "7");
        cases.put(Arrays.asList(1,2,5,3,4,7,8,6), "4");
        cases.forEach((in, exp) -> {
            System.out.printf("input: %s expected: %s \n", in, exp);
            minimumBribes2(in);
        });
    }
}
