package infcode.secssion1_String;

import java.util.Scanner;

public class quiz2_9_Main {
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
        int[] width = new int[n];
        int[] height = new int[n];
        int upToDownDiagonal = 0;
        int downToUpDiagonal = 0;

        int maxNumver = 0;
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                width[i] += q[i][k]; // 00, 01, 02
                height[i] += q[k][i]; // 00, 10, 20,

                if(i == 0){
                    upToDownDiagonal += q[k][k]; // 00, 11, 22, 33
                    downToUpDiagonal += q[n-1-k][k]; //40, 31, 22, 13
                }
            }
            answer = Math.max(answer, width[i]);
            answer = Math.max(answer, height[i]);
        }
        answer = Math.max(answer , upToDownDiagonal);
        answer = Math.max(answer , downToUpDiagonal);

        return answer;
    }
}
