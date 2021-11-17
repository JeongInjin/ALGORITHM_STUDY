package infcode.secssion2_Array;

import java.util.Scanner;

public class quiz_2_10_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] q = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                q[i][k] = sc.nextInt();
            }
        }

        System.out.print(solution(n, q));
    }

    public static Integer solution(int n, int[][] q){
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                boolean same = true;
                int compare = q[i][k];
                if(i-1 >= 0 && q[i-1][k] >= compare) same = false;
                if(i+1 < n && q[i+1][k] >= compare) same= false;
                if(k-1 >= 0 && q[i][k-1] >= compare) same = false;
                if(k+1 < n && q[i][k+1] >= compare) same = false;
                if(same) answer++;
            }
        }
        return answer;
    }
}
