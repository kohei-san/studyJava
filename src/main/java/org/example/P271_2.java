package org.example;

public class P271_2 {
    public static void main(String[] args) {
//        var input = "ab0c1ba2bc9cd1";
//        String result = "";
//        char prev = 0;
//        for (char ch : input.toCharArray()) {
//            if (ch >= '0' && ch <= '9') {
//                result += Character.toString(prev).repeat(Character.getNumericValue(ch) + 1);
//            } else {
//                result += Character.toString(ch);
//            }
//            prev = ch;
//        }
//        System.out.println(input);
//        System.out.println(result);

        // 模範解答
        var input = "ab0c1ba2bc9cd1";

        var buf = new StringBuilder();
        var pre = '0';
        for (var ch : input.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                if (pre == '0') { // 0のときは先頭文字なので何も出力しない
                    continue;
                }
                for (int i = 0; i < ch - '0' + 1; i++) {
                    buf.append(pre);
                }
            } else {
                pre = ch;
                buf.append(ch);
                /*
                通常処理をelseの中に記述し、例外をifとして記述しているように思える。
                 */
            }
        }

        var result = buf.toString();
        System.out.println(input);
        System.out.println(result);
    }
}
