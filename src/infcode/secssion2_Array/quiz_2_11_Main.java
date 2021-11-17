package infcode.secssion2_Array;

import java.util.Scanner;

public class quiz_2_11_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] q = new int[n+1][6];
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= 5; k++){
                q[i][k] = sc.nextInt();
            }
        }

        System.out.print(solution(n, q));
    }
    public static int solution(int n, int[][] arr){
        int answer=0, max=0;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
//                    System.out.println(i +" " + k + "    " + j + " " + k);/**/
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
}
