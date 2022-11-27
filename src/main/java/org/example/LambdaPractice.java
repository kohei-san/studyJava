package org.example;

import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {
        // p219練習問題
        var arr = List.of("aaa", "bbb", "ccc");
        for (String s : arr) {
            System.out.println(upper(s));
            System.out.println(empty(s));
        }

    }

    static String upper(String s) {
        return s.toUpperCase();
    }

    static boolean empty(String s) {
        return s.isEmpty();
    }
}
