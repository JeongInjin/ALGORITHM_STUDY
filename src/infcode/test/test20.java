package infcode.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test20 {
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    static int[][] board, ch;
    static int n, m;
    private static class Point {
        private int x,y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static Queue<Point> Q=new LinkedList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        ch = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                board[i][k] = sc.nextInt();
                if(board[i][k]==1) Q.offer(new Point(i, k));
            }
        }
        BFS();
        boolean flag=true;
        int answer=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 0) flag = false;
            }
        }
        if(flag){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    answer=Math.max(answer, ch[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
    public static void BFS(){
        while (!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
}
