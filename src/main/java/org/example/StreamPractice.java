package org.example;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "orange", "pineapple");
        // 条件にマッチする値を大文字に変換
        var result = strs.stream().filter(s -> s.length() >= 6).map(s -> s.toUpperCase()).toList();
        System.out.println(result);

        // 条件にマッチする値の文字数の合計
        var result2 = strs.stream().filter(s -> s.length() >= 6).mapToInt(s -> s.length()).sum();
        System.out.println(result2);

        // 全ての値が特定の文字を含むか
        var result3 = strs.stream().allMatch(s -> s.contains("a"));
        System.out.println(result3);

        // 1つでも特定の文字を含むか
        var result4 = strs.stream().anyMatch(s -> s.contains("c"));
        System.out.println(result4);
    }
}
