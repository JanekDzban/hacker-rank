package com.hackerrank.interview_prep.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SalesByMatchResult {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> colors = new HashMap<>();
        ar.forEach(color -> colors.merge(color, 1, Integer::sum));
        return colors.values()
                .stream()
                .map(count -> count / 2)
                .reduce(Integer::sum).orElse(0);
    }
}

public class SalesByMatch {
    public static void main(String[] args) {
        Map<List<Integer>, Integer> cases = new HashMap<>();
        cases.put(Arrays.asList(1,2,3,1,1,3,4,8,6,2), 3);
        cases.put(Arrays.asList(10,20,20,10,10,30,50,10,20), 3);
        cases.forEach((in, out) -> {
            int result = SalesByMatchResult.sockMerchant(in.size(), in);
            System.out.printf("%s %s %s%n", in, out, result);
        });
    }
}

