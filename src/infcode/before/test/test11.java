package infcode.before.test;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class test11 {
    static int n = 7, m =7;
    static int[][] board, ch;
    static int[] ps = {-1, 0, 1, 0};
    static int[] pe = {0, 1, 0, -1};
    static boolean flag = false;
    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        board  = new int[8][8];
        ch = new int[8][8];

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= m; k++){
                board[i][k] = sc.nextInt();
            }
        }

        BFS(1, 1);

        if(board[n][m] == 0){
            System.out.print(-1);
        }else{
            System.out.print(ch[n][m]);
        }
    }
    private static void BFS(int s, int e){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(s, e));
        board[s][e] = 1;
        while(!queue.isEmpty()){
            Point tmp = queue.poll();

            for(int i = 0; i < 4; i++){
                int nx = tmp.x + ps[i];
                int ny = tmp.y + pe[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                }
            }
        }
    }


}
