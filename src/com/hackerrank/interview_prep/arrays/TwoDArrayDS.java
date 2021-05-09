package com.hackerrank.interview_prep.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class TwoDArrayDSResult {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int sum = -64 ; //-9 * 7 - 1
        for(int i = 0, n = arr.size(); i < n - 2; i++) {
            List<Integer> row1 = arr.get(i);
            List<Integer> row2 = arr.get(i + 1);
            List<Integer> row3 = arr.get(i + 2);
            for(int j = 0; j < n - 2; j++) {
                int newSum = row1.get(j) + row1.get(j + 1) + row1.get(j + 2)
                                    + row2.get(j + 1) +
                        row3.get(j) + row3.get(j + 1) + row3.get(j + 2);
                sum = Math.max(sum, newSum);
            }
        }
        return sum;
    }
}

public class TwoDArrayDS {
    public static void main(String[] args) {
        Map<List<List<Integer>>, Integer> cases = new HashMap<>();
        cases.put(Arrays.asList(
                Arrays.asList(1,1,1,0,0,0),
                Arrays.asList(0,1,0,0,0,0),
                Arrays.asList(1,1,1,0,0,0),
                Arrays.asList(0,0,0,0,0,0),
                Arrays.asList(0,0,0,0,0,0),
                Arrays.asList(0,0,0,0,0,0)), 7);
        cases.put(Arrays.asList(
                Arrays.asList(-9,-9,-9, 1, 1, 1),
                Arrays.asList( 0,-9, 0, 4, 3, 2),
                Arrays.asList(-9,-9,-9, 1, 2, 3),
                Arrays.asList( 0, 0, 8, 6, 6, 0),
                Arrays.asList( 0, 0, 0,-2, 0, 0),
                Arrays.asList( 0, 0, 1, 2, 4, 0)), 28);
        cases.put(Arrays.asList(
                Arrays.asList(1,1,1,0,0,0),
                Arrays.asList(0,1,0,0,0,0),
                Arrays.asList(1,1,1,0,0,0),
                Arrays.asList(0,0,2,4,4,0),
                Arrays.asList(0,0,0,2,0,0),
                Arrays.asList(0,0,1,2,4,0)), 19);
        cases.put(Arrays.asList(
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 9, 2,-4,-4, 0),
                Arrays.asList(0, 0, 0,-2, 0, 0),
                Arrays.asList(0, 0,-1,-2,-4, 0)), 13);
        cases.forEach((in, exp) -> {
            int out = TwoDArrayDSResult.hourglassSum(in);
            String inf = Arrays.stream(in.toArray())
                    .map(Object::toString)
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.printf("input: %n%s output: %s expected: %s%n", inf, out, exp);
        });
    }
}