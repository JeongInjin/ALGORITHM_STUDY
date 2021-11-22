package infcode.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test6 {
    static int total, n;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        total = sc.nextInt();
        DFS(0, 0, arr);
        System.out.println(answer);
    }

    private static void DFS(int L, int sum, Integer[] arr) {
        if(total < sum) return;
        if(L >= answer) return;
        if(total == sum){
            answer = Math.min(answer, L);
        }else{
            for(int i = 0; i < n; i++){
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }
}
