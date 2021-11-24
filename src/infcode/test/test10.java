package infcode.test;
import java.util.Scanner;
public class test10 {
    static int n, m;
    static int[][] ch;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n+1][n+1];
        System.out.println(DFS(n, m));
    }
    public static int DFS(int n, int r){
        if(ch[n][r] > 0) return ch[n][r];
        if(r == 0 || n == r){
            return 1;
        }else{
            return ch[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }
}
