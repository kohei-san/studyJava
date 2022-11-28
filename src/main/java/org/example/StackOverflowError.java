package org.example;

public class StackOverflowError {
    public static void main(String[] args) {
        // 再帰させ続けるとエラーとなる
        infinite();
    }
    static void infinite(){
        infinite();
    }
}
