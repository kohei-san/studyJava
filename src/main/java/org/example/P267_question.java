package org.example;

public class P267_question {
    public static void main(String[] args) {
        var data = "abcde";

        var builder = new StringBuilder();
        for (int i = 0; i < data.length(); i += 2) { // 2ずつインクリメントすることで、処理する単位を決めている
            System.out.println(data.length());
            if (i + 1 < data.length()) {
                builder.append(data.charAt(i + 1));
            }
            builder.append(data.charAt(i)); // 通常の文字列追加。次の文字があれば↑で先に配列に加えることで、文字の入れ替えをしている。
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
