package org.example;

public class P271_1 {
    public static void main(String[] args) {
//        var data = "aa0bcd1efg1gg0abc";
//        var upper = false;
//        var builder = new StringBuilder();
//
//        for (char ch : data.toCharArray()) {
//            if (ch == '0') {
//                upper = !upper;
//                continue;
//            } else if (ch == '1') {
//                upper = false;
//                continue;
//            }
//
//            if (upper) {
//                builder.append((char) (ch - 32));
//            } else {
//                builder.append(ch);
//            }
//        }
//        System.out.println(data);
//        System.out.println(builder.toString());

        // 以下、模範解答
        var input = "aa0bcd1efg1gg0abc";

        var buf = new StringBuilder();
        var lower = true;
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '0' -> lower = false;
                case '1' -> lower = true;
                default -> {
                    if (lower) {
                        buf.append(Character.toLowerCase(ch));
                    } else {
                        buf.append(Character.toUpperCase(ch));
                    }
                }
            }
        }
        var result = buf.toString();
        System.out.println(input);
        System.out.println(result);

    }
}
