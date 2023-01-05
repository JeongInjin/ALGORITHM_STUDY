package infcode.before.test;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class test16 {
    // m : 상자 가로 칸 수, n : 세로 칸 수 ex)m, n : 6, 4 - 6열 4행
    static int m, n;
    static int[][] board, visit;
    static Queue<Point> queue = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    //Point Class
    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        //init
        board = new int[n][m];
        visit = new int[n][m];

        //1 : 익은토마토, 0 : 익지 않은 토마토, -1 : 빈값
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                board[i][k] = sc.nextInt();
                if(board[i][k] == 1) queue.offer(new Point(i, k));
            }
        }
        solution();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                if(board[i][k] == 0) flag = false;
            }
        }
        if(flag){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    answer=Math.max(answer, visit[i][j]);
                }
            }
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }
    }
    public static void solution(){
        while(!queue.isEmpty()){
            Point s = queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = s.x + dx[i];
                int ny = s.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && visit[nx][ny] == 0){
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    visit[nx][ny] = visit[s.x][s.y] + 1;
                }
            }
        }
    }
}
