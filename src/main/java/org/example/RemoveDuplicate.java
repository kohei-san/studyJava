package org.example;

public class RemoveDuplicate {
    public static void main(String[] args) {
        var data = "abccbaabcc";

        var builder = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            var ch = data.charAt(i);
            if (i > 0 && ch == data.charAt(i - 1)) {
                continue;
            }
            builder.append(ch); // 配列に10進数のasciiコードが格納される。
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
