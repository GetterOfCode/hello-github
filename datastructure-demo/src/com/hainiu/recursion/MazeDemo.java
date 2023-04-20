package com.hainiu.recursion;

public class MazeDemo {
    public static void main(String[] args) {
        System.out.println(maze(0, 0));
    }

    /**
     * 递归算法解决迷宫路径问题
     * @param x
     * @param y
     * @return
     */
    private static int maze(int x,int y){
        if (x == 4 || y ==4){
            return 1;
        }
        return maze(x,y+1)+maze(x+1,y);
    }
}
