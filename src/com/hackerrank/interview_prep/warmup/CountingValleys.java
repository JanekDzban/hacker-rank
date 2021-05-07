package com.hackerrank.interview_prep.warmup;

import java.util.HashMap;
import java.util.Map;

class CountingValleysResult {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int valleys = 0;
        for(int i = 0; i < steps; i++) {
            char direction = path.charAt(i);
            if(direction == 'U') {
                level++;
            } else {
                if(level == 0) {
                    valleys++;
                }
                level--;
            }
        }
        return valleys;
    }
}

public class CountingValleys {
    public static void main(String[] args) {
        Map<String, Integer> cases = new HashMap<>();
        cases.put("UDDDUDUU", 1);
        cases.put("DDUUDDUDUUUD", 2);
        cases.forEach((in, out) -> {
            int result = CountingValleysResult.countingValleys(in.length(), in);
            System.out.printf("%s %s %s%n", in, out, result);
        });
    }
}
