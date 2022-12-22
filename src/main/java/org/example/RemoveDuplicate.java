package org.example;

public class RemoveDuplicate {
    public static void main(String[] args) {
        var data = "abcde";
        var builder = new StringBuilder();
//        for (int i = 0; i < data.length(); i++) {
//            var ch = data.charAt(i);
//            if (i > 0 && ch == data.charAt(i - 1)) {
//                continue;
//            }
//            builder.append(ch); // 配列に10進数のasciiコードが格納される。
//        }

        char prev = 0;
        int count = 1;
        for (char ch : data.toCharArray()) {
            if (ch == prev) {
                continue;
            }

            if (count % 2 == 0) {
                builder.append(ch);
                builder.append(prev);
            }

            if (count >= data.length()) {
                builder.append(ch);
            }
            prev = ch;
            count++;
        }

        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
