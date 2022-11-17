package org.example;

import java.util.List;

public class ForEachSample {
    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "grape");
        for (String str : strs) {
            System.out.println(str);
        }
    }
/*
    練習問題
    public static void main(String[] args) {
        var names = List.of("yousuke", "kis", "sugiyama");
        for (int i = 0; i < names.size(); i++) {
            var name = names.get(i);
            System.out.println(name);
        }
    }
*/
}
