package org.example;
import java.io.IOException;

public class Maze {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {}
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1,3);
        var goal = new Position(4, 1);
        var upper = false;
        for (;;) {
            // 迷路の表示
            for (int y = current.y() -2; y <= current.y() + 2; y++) {
                for (int x = current.x() -2; x <= current.x() + 2; x++) {
                    if (y < 0 || y > map.length || x < 0 || x > map[y].length ) {
                        System.out.print("#");
                    } else if (x == current.x() && y == current.y()) {
                        System.out.print(upper? "o": "O");
                    } else if (x == goal.x() && y == goal.y()) {
                        System.out.print("G");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            // ゴール判定
            if (current.equals(goal)) {
                System.out.println("GOAL");
                break;
            }
            // キー処理入力
            int ch = System.in.read();
            if (ch == 10) {continue;}

            //　押された方向の入力を得る
            var next = switch (ch) {
                case 'h', 'a' -> new Position(current.x() - 1, current.y());
                case 'u', 'w' -> new Position(current.x(), current.y() - 1 );
                case 'j', 's' -> new Position(current.x() + 1, current.y());
                case 'n', 'z' -> new Position(current.x(), current.y() + 1);
                default -> current;
            };

            // 押された方向が通路なら進む
            if (map[next.y()][next.x()] == 0) {
                if (!current.equals(next)) {
                    upper = !upper;
                }
                current = next;
            }
            // エンターキーの入力を捨てる
            System.in.read();
        }
    }
}
