package org.example;

public class IfSample {
    public static void main(String[] args) {
        var a = 6;
        switch (a) {
            case 1:
            case 2:
                System.out.println("小さい");
                break;
            case 3:
                System.out.println("中くらい");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}