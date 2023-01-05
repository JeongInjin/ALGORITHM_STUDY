package infcode.before.secssion8_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
10. 미로탐색(DFS)
설명

7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.

출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 통로이다.

격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면

Image1.jpg

위의 지도에서 출발점에서 도착점까지 갈 수 있는 방법의 수는 8가지이다.


입력
7*7 격자판의 정보가 주어집니다.


출력
첫 번째 줄에 경로의 가지수를 출력한다.


예시 입력 1

0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0
예시 출력 1

8
 */
public class q_10_미로탐색 {
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
