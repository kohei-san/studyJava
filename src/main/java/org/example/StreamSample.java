package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
    public static void main(String[] args) {

        var data = List.of("yamamoto", "kis", "sugiyama", "aaaaa");
        ArrayList<String> result;
        int result2;

        result = data.stream().
                filter(s -> s.length() >= 5)
                .collect(Collectors.toCollection(ArrayList::new));

        result2 = (int) data.stream()
                .filter(s -> s.length() >= 5)
                .count();

        data.forEach(System.out::println);

        System.out.println(result);
        System.out.println(result2);


        /*
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
        */
    }
}
