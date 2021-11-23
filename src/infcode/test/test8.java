package infcode.test;

import java.util.Scanner;

public class test8 {
    static int n, maxKg;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        maxKg = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        DFS(0, 0, arr);
        System.out.print(answer);
    }
    public static void DFS(int L, int sum, int[] arr){
        if(sum > maxKg) return;

        if(L == n){
            answer = Math.max(answer, sum);

        }else{
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }

    }
}
