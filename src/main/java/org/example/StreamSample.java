package org.example;

import java.util.ArrayList;
import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        /*
        var data = List.of("yamamoto", "kis", "sugiyama", "aaaaa");
        var result = new ArrayList<String>();
        var result2 = 0;

        for (String s : data) {
            if (s.length() >= 5) {
                result.add(s);
                result2++;
            }
        }
        System.out.println(result);
        System.out.println(result2);
        */

        var list = List.of("apple", "banana", "grape", "aaa");
        var result = new ArrayList<String>();
        var count = 0;
        var bool = true;
        var oneOfThemHasTarget = false;
        for (String s : list) {
            if (s.length() == 5) {
                result.add(s);
                count++;
                if (!s.contains("p")) {
                    bool &= false;
                }
            }
            if (s.contains("p")) {
                oneOfThemHasTarget = true;
            }
        }
        System.out.println("result: " + result);
        System.out.println("count: " + count);
        System.out.println("bool: " + bool);
        System.out.println("oneOfThemHasTarget: " + oneOfThemHasTarget);
    }
}
