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

        int jumps = 0;
        for(int i = 0; i < safeCloudsPositions.size() - 1;) {
            if(safeCloudsPositions.get(i) + 2 == safeCloudsPositions.get(i + 1)) {
                i+=2;
            } else {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

}

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Map<List<Integer>, Integer> cases = new HashMap<>();
        cases.put(Arrays.asList(0,0,1,0,0,1,0), 4);
        cases.put(Arrays.asList(0,0,0,0,1,0), 3);
        cases.forEach((in, out) -> {
            int result = JumpingOnTheCloudsResult.jumpingOnClouds(in);
            System.out.printf("%s %s %s%n", in, out, result);
        });
    }
}