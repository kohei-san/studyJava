package org.example;

public class TraverseDeep {
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
        return false;
    }
}
