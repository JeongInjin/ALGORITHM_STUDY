package infcode.before.test;

import java.util.Scanner;

public class 아마존인터뷰test1 {
    static int n, total = 0;
    static boolean flag = false;
    static String answer = "NO";
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }

    private static void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(total / 2 < sum) return;
        if(L == n){
            if(total / 2 == sum){
                answer = "YES";
                flag = true;
                return;
            }
        }else{
            DFS(L + 1,  sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }
}
