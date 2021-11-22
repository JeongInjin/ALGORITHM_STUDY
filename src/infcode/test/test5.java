package infcode.test;

import java.util.Scanner;

public class test5 {
    //q: 문제수, 시간
    //a: 점수, 시간
    //시간내로 가장 많은 점수.
    static int totalTime, n;
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 문제수
        totalTime = sc.nextInt(); // 시간

        int[] ps = new int[n]; // 포인트
        int[] pt = new int[n]; // 한문제당 시간
        for(int i = 0; i < n; i++){
            ps[i] = sc.nextInt();
            pt[i] = sc.nextInt();
        }
        DFS(0, 0, 0, ps, pt);
        System.out.println(answer);
    }

    private static void DFS(int L, int totalPs, int totalPt, int[] ps, int[] pt) {
        if(totalTime < totalPt) return;
        if(L == n){
            answer = Math.max(answer, totalPs);
            return;
        }
        else{
            DFS(L + 1, totalPs + ps[L], totalPt + pt[L], ps, pt);
            DFS(L + 1, totalPs, totalPt, ps, pt);
        }
    }
}
