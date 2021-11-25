package infcode.test;
import infcode.secssion8_DFS_BFS_활용.q_11_미로의최단거리_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class test10 {
    static int n = 7, m = 7;
    static int[][] board;
    static int[][] ch;
    static int[] dx = { -1, 0, 1, 0};
    static int[] dy = { 0, 1, 0, -1};
    static class Point{
        private int x;
        private int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        board = new int[n+1][m+1];
        ch = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= m; k++){
                board[i][k] = sc.nextInt();
            }
        }
        BFS(1, 1);
        if(ch[n][m] == 0) System.out.println(-1);
        else System.out.print(ch[n][m]);
    }
    public static void BFS(int x, int y){
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y] = 1;
        while(!Q.isEmpty()){
            Point tmp = Q.poll();

            for(int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <=7 && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
}
