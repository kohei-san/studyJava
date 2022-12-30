package org.example;

import java.util.ArrayDeque;

public class TraverseDeep_2 {
    public static void main(String[] args) {
        int[][] map = {
                {1,1,1,1,1,1,1},
                {1,0,1,0,0,0,1},
                {1,0,0,0,1,1,1},
                {1,0,1,0,0,2,1},
                {1,1,1,1,1,1,1}
        };
        traverse(map, 1,1);
        char[] ch = {'.', '*', 'G', 'o'};
        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(ch[cell]);
            }
            System.out.println();
        }
    }

    static boolean traverse(int[][] map, int curX, int curY) {
        record Position(int x, int y) {}

        var stack = new ArrayDeque<Position>(); // どんな値を持っているかチェック
        stack.push(new Position(curX, curY));
        for (Position p; (p = stack.pollFirst()) != null ;) {
            switch (map[p.y][p.x]) {
                case 0: break;
                case 2: return true;
                default: continue;
            }
            map[p.y][p.x] = 3;
            // pushしてpollFirstすると後入先出し→深さ優先探索
            stack.push(new Position(p.x + 1, p.y));
            stack.push(new Position(p.x - 1 ,p.y));
            stack.push(new Position(p.x, p.y + 1));
            stack.push(new Position(p.x, p.y - 1));
            // addしてpollFirstなら先入先出し→幅優先探索
//            stack.add(new Position(p.x + 1, p.y));
//            stack.add(new Position(p.x - 1 ,p.y));
//            stack.add(new Position(p.x, p.y + 1));
//            stack.add(new Position(p.x, p.y - 1));
        }
        return false;
    }
}
