package infcode.before.test;

import java.util.Scanner;

public class test9 {
    static int n, maxTime;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        maxTime = sc.nextInt();
        int[] ps = new int[n];
        int[] pt = new int[n];
        for(int i = 0; i < n; i++){
            ps[i] = sc.nextInt();
            pt[i] = sc.nextInt();
        }
        //level, sumScore, sumTime, ps, pt
        DFS(0, 0, 0, ps, pt);
        System.out.println(answer);
    }
    public static void DFS(int L, int sc, int st, int[] ps, int[] pt){
        if(maxTime < st){
            return;
        }
        if(L == n){
            answer = Math.max(answer, sc);
        }else{

            DFS(L + 1, sc + ps[L], st + pt[L], ps, pt);
            DFS(L + 1, sc, st, ps, pt);
        }
    }
}
