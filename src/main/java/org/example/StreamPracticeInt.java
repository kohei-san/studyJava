package org.example;

import java.util.stream.IntStream;

public class StreamPracticeInt {
    public static void main(String[] args) {
        // p222練習問題
        // ラムダ式をメソッド参照に変換
        var nums = new int[] {1,2,3};
//        var list = IntStream.of(nums).mapToObj(n -> "*".repeat(n)).toList();
        IntStream.of(nums).mapToObj("*"::repeat).toList().forEach(System.out::println);
    }
}
