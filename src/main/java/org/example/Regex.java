package org.example;

public class Regex {
    static boolean check(String data){
        return data.matches("(0|[1-9][0-9]*)(\\.[0-9]+[1-9])?");
    }

    public static void main(String[] args) {
        System.out.println(check("12.304-")); // false
        System.out.println(check("12.3004.")); // false
        System.out.println(check("12.301")); // true
        System.out.println(check("12.3033")); // false
        System.out.println(check("12.0")); // false
    }
}
