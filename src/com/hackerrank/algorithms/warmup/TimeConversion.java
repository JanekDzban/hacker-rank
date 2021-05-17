package com.hackerrank.algorithms.warmup;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

public class TimeConversion {
    public static String timeConversion(String s) {
        LocalTime input = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        return input.format(DateTimeFormatter.ISO_TIME);
    }

    public static void main(String[] args) {
        Map<String, String> cases = new LinkedHashMap<>();
        cases.put("12:01:00PM","12:01:00");
        cases.put("12:01:00AM","00:01:00");
        cases.put("07:05:45PM","19:05:45");

        cases.forEach((in, exp) -> {
            String out = timeConversion(in);
            System.out.printf("input: %s expected: %s output: %s %n", in, exp, out);
        });
    }
}
