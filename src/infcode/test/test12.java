package infcode.test;

import java.util.Scanner;

public class test12 {
    static int n = 7, m = 7;
    static int[][] board, visit;
    static int answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        visit = new int[8][8];

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= m; k++){
                board[i][k] = sc.nextInt();
                visit[i][k] = board[i][k];
            }
        }
        visit[1][1] = 1;
        solution(1,1);
        System.out.println(answer);
    }

    //
    private static void solution(int x, int y){
        if(x == 7 && y == 7) answer++;
        else{
            Point tmp = new Point(x, y);
            for(int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >=1 && ny <= 7 && visit[nx][ny] == 0){
                    visit[nx][ny] = 1;
                    solution(nx, ny);
                    visit[nx][ny] = 0;
                }
            }
        }


    }
}
