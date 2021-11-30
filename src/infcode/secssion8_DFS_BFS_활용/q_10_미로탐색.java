package infcode.secssion8_DFS_BFS_활용;

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
