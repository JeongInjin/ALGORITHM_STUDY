package infcode.before.test;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class test17 {
    static int n;
    static int answer  = 0;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> Q = new LinkedList<>();

    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] board = new int[n+1][n+1];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                board[i][k] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(board[i][k] == 1){
                    answer++;
                    Q.offer(new Point(i, k));
                    solution(i, k, board);
                }
            }
        }
        System.out.println(answer);
    }

    public static void solution(int x, int y, int[][] board){
        board[n][y] = 0;

        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i = 0; i < 8; i++){
                for(int k = 0; k < 8; k++){
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[k];
                    if(nx >= 0 && nx <= n && ny >= 0 && ny <= n && board[nx][ny] == 1){
                        Q.offer(new Point(nx, ny));
                        board[nx][ny] = 0;
                        solution(nx, ny, board);
                    }
                }
            }
        }

    }
}
