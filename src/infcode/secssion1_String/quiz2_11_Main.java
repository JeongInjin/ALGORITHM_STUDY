package infcode.secssion1_String;

import java.util.Scanner;

public class quiz2_11_Main {
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
        int[] count = new int[n];
        int std = 0;
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                std = q[i][k];
                for(int m = 0; m < n; m++){
                    if(k != m){
                        if(q[m][i] == std){
                            count[i]++;
                            break;
                        }
                    }
                }
            }
        }
        int max = count[0];
        answer = 1;
        for(int i = 0; i < n - 1; i++){
            if(count[i] < count[i+1]) answer++;
        }
        return answer;
    }
}
