package org.example;

public class RunLengthCompression {
    public static void main(String[] args) {
        final var COUNTER_BASE = -1;
        var data = "abbcccbaaaabccccccccccccddd";

        var count = COUNTER_BASE;
        char prev = 0;
        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (prev == ch) {
                count++;
                if (count == 9) {
                    builder.append('9');
                    count = COUNTER_BASE;
                    prev = 0;
                }
            } else {
                if (count >= 0) {
                    builder.append((char) ('0' + count)); // append()メソッドは、引数がchar, intなど型に応じてオーバーロードされているため、追加される結果が異なってくる。
//                    builder.append(('0' + count));

                    count = COUNTER_BASE;
                }
                builder.append(ch);
                prev = ch;
            }
        }
        if (count >= 0) {
            builder.append((char) ('0' + count));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
