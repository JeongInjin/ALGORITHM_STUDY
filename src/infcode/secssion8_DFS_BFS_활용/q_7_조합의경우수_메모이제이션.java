package infcode.secssion8_DFS_BFS_활용;

import java.util.Scanner;
/*
7. 조합의 경우수(메모이제이션)
설명
nCr = (n-r)!r! / n!;
Image1.jpg로 계산합니다.

하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.

nCr = n-1 C r-1 + n-1 C r
Image1.jpg


입력
첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.


출력
첫째 줄에 조합수를 출력합니다.


예시 입력 1

5 3
예시 출력 1

10
예시 입력 2

33 19
예시 출력 2

818809200
* */
public class q_7_조합의경우수_메모이제이션 {
    static int[][] ch;
    static int n, r;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        ch = new int[n+1][n+1];

        System.out.println(DFS(n, r));
    }
    public static int DFS(int n, int r){
        if(ch[n][r] != 0) return ch[n][r];
        if(n == r || r == 0){
            return 1;
        }else{
            // 5 3
            //  5!   5 4 3 2 1
            // 2!3!  2 1 3 2 1
           return ch[n][r]  = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }
}
