package infcode.before.test;

import java.util.Scanner;

public class tes19 {
    static int n = 7, m =7;
    static int answer = 0;
    static int[][] ch = new int[n+1][m+1];
    static int[] dx = { -1, 0, 1, 0};
    static int[] dy = { 0, 1, 0, -1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= m; k++){
                ch[i][k] = sc.nextInt();
            }
        }
        ch[1][1] = 1;
        DFS(1, 1);
        System.out.println(answer);
    }
    public static void DFS(int x, int y){
        if(x == 7 && y == 7) answer++;
        else{
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && ch[nx][ny]==0){
                    ch[nx][ny]=1;
                    DFS(nx, ny);
                    ch[nx][ny]=0;
                }
            }
        }
    }
}
