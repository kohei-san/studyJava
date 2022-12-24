package org.example;

public class P275_2 {

    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO, FRAC_ZERO, MINUS
    }
    static boolean check(String data) {
        var state = FloatState.START;

        for (char ch : data.toCharArray()) {
            switch (state) {
                case START -> {
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else if (ch == '-') {
                        state = FloatState.MINUS;
                    } else {
                        return false;
                    }
                }
                case ZERO -> {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else if (ch == '0') {
                        state = FloatState.FRAC_ZERO;
                    } else {
                        return false;
                    }
                }
                case INT -> {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }
                case MINUS -> {
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }
                case FRAC_START, FRAC, FRAC_ZERO -> {
                    if (ch >= '1' && ch <= '9') {
                        state = FloatState.FRAC;
                    } else if (ch == '0') {
                        state = FloatState.FRAC_ZERO;
                    } else {
                        return false;
                    }
                }
            }
        }

        return switch (state) {
            case INT -> true;
            case ZERO -> true;
            case FRAC -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println(check("-12.304")); // true
        System.out.println(check("--12.3004")); // false
        System.out.println(check("1-2.3004")); // false
        System.out.println(check("-.3004")); // false
    }
}
