package com.hackerrank.interview_prep.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class JumpingOnTheCloudsResult {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        Map<Integer, Integer> cloudPositions = new HashMap<>();
        for(int i = 0; i < c.size(); i++) {
            cloudPositions.put(i, c.get(i));
        }
        List<Integer> safeCloudsPositions = cloudPositions.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for(int i = 0; i < safeCloudsPositions.size(); i++) {
            try {
                if(safeCloudsPositions.get(i) + 1 == safeCloudsPositions.get(i + 1) &&
                        safeCloudsPositions.get(i + 1) + 1 == safeCloudsPositions.get(i + 2)) {
                    safeCloudsPositions.remove(i + 1);
                }
            } catch(IndexOutOfBoundsException ignored) {}
        }
        return safeCloudsPositions.size() - 1;
    }

}

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Map<List<Integer>, Integer> cases = new HashMap<>();
        cases.put(Arrays.asList(0,0,1,0,0,1,0), 4);
        cases.put(Arrays.asList(0,0,0,0,1,0), 3);
        cases.put(Arrays.asList(0,0,0,1,0,0), 3);
        cases.forEach((in, exp) -> {
            int out = JumpingOnTheCloudsResult.jumpingOnClouds(in);
            System.out.printf("input: %s output: %s expected: %s%n", in, out, exp);
        });
    }
}