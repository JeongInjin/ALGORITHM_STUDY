package infcode.test;

import java.util.Scanner;

public class test3 {
    static String answer = "NO";
    static boolean flag = false;
    static int[] ch;
    static int n, total;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n];
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }

    private static void DFS(int L, int sum, int[] arr) {
        if(total - sum == sum){
            answer = "YES";
            flag = true;
            return;
        }
        if(flag || L == n ){
            return;
        }else{
            DFS(L + 1, sum, arr);
            DFS(L + 1, sum + arr[L], arr);
        }
    }
}
