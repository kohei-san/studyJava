package org.example;

public class RecursiveLoop {
    public static void main(String[] args) {
        // 再帰処理のサンプル
        loop(0);
    }

    static void loop(int i) {
        if (i >= 5) { // 再帰回数があまりに多いとStackoverflowとなる
            return;
        }
        System.out.println(i);
        loop(i + 1);
    }
}
