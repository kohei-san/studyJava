package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P267_question2 {
    public static void main(String[] args) {
        var data = new int[]{3, 6, 9, 4, 2, 1, 5};

        var builder = IntStream.builder();
        for (int i = 0; i < data.length; ++i) {
            if (i < data.length - 1) {
                builder.add(Math.max(data[i], data[i + 1]));
            } else {
                // 最後の要素
                builder.add(data[i]);
            }
        }

        var result = builder.build().toArray();
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(result));
    }
}
