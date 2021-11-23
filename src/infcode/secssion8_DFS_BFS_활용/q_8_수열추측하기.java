package infcode.secssion8_DFS_BFS_활용;

import java.util.Scanner;
public class q_8_수열추측하기 {
    static int[] b, p, ch;
    static int n, m;
    static int[] dy;
    static boolean flag = false;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        DFS(0, m);
    }
    private static void DFS(int L, int sum){
        if(sum > m) return;
        if(L == m){

        }else{
            for(int i = 0; i < n; i++){
                DFS(L + 1, sum + L);
            }
        }
    }
}
