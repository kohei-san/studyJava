package org.example;

public class MethodSample {
    public static void main(String[] args) {
        record Student(String name, int englishScore, int mathScore) {
            String showResult() {
                var avarage = (englishScore + mathScore) / 2;
                return name + "さんの平均点は" + avarage + "点です";
            }
        }

        var s = new Student("kohei", 80, 60);
        System.out.println(s.showResult());
    }
}
