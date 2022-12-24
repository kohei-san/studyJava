package org.example;

public class Calc_with_Quotation {
    public static void main(String[] args) {
        /*
        単一引用符で囲った値で計算を行うと、asciiコードが計算対象となる。
         */
        System.out.println('0' + 5); // 53
        System.out.println('a' + 5); // 102
        System.out.println('あ' + 5); // 12359

        /*
        二重引用符で囲った値では、文字列の連結となる。
         */
        System.out.println("0" + 5); // 05
        System.out.println("a" + 5); // a5
        System.out.println("あ" + 5); // あ5
    }
}
