package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamPracticeInt {
    public static void main(String[] args) {
        // p222練習問題
        // ラムダ式をメソッド参照に変換
        var nums = new int[] {1,2,3};
//        var list = IntStream.of(nums).mapToObj(n -> "*".repeat(n)).toList();
        IntStream.of(nums).mapToObj("*"::repeat).toList().forEach(System.out::println);

        // p223問題
        // ラムダ式　〜　メソッド参照
        var names = new String[] {"aaa", "bbb", "ccc"};
        var list = Arrays.stream(names).map(String::toUpperCase).toList();
        System.out.println(list);

        var list2 = list.stream().map("%sさん"::formatted).toList();
        System.out.println(list2);

        var list3 = list.stream().map(s -> s.toLowerCase()).toList();
        System.out.println(list3);

    }
}
