package infcode.before.secssion2_Array;

import java.util.Scanner;

public class quiz_2_1_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        int[] q = new int[n];
        for (int i = 0; i < n; i++){
            q[i] = sc.nextInt();
        }
        System.out.print(solution(q));
    }
    public static String solution(int[] q){
        String answer = String.valueOf(q[0]) + " ";

        for(int i = 1; i < q.length; i++){
            if(q[i-1] < q[i]) answer += String.valueOf(q[i]) + " ";
        }

        return answer;
    }
}
