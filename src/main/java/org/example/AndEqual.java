package org.example;

public class AndEqual {
    public static void main(String[] args) {
        var bool = true;
        bool &= "test" == "test";
        System.out.println(bool);

        bool &= false;
        System.out.println(bool);

        bool &= true;
        System.out.println(bool);
    }
}
