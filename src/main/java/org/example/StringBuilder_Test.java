package org.example;

public class StringBuilder_Test {
    public static void main(String[] args) {
        var builder = new StringBuilder();

        for (int i = 0; i < 17; i++) {
            builder.append("a");
//            builder.append(String.valueOf(i)); // StringBuilderが格納するのはascii文字のため、2文字以上を入力した場合は1文字ずつに分解されて、それぞれ配列の１要素として格納される。
        }

        var result = builder.toString();
        System.out.println(result);
        /*
        StringBuilderの配列の増え方に違和感を感じたため、調べてみた。
        初期はbyte[16]だが、それを超えると要素数が34になる。次は70...
        これはoldLength +　(oldLength + 2) しているため。
         */
    }
}
