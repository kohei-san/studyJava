package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamPractice {
    public static void main(String[] args) {
        // java11以前のバージョンで文字列をリピートさせる(for文も可能)
        var result = IntStream.range(0, 3)
                .mapToObj(n -> "test")
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
