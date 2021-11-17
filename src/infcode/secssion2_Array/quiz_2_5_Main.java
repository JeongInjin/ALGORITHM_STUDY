package infcode.secssion2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quiz_2_5_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] q = new int[n];
        for(int i = 0; i < n; i++){
            q[i] = sc.nextInt();
        }
        for(int v : solution(q)){
            System.out.print(v +" ");
        }
    }
    public static List<Integer> solution(int[] q){
        List<Integer> answer = new ArrayList<>();
        int[] reversArr = new int[q.length];

        for(int i = 0; i < q.length; i++){
            StringBuilder sb = new StringBuilder(String.valueOf(q[i]));
            reversArr[i] = Integer.parseInt(sb.reverse().toString());
        }

        for(int i = 0; i < reversArr.length; i++){
            if(!isPrime(reversArr[i])) answer.add(reversArr[i]);
        }
        return answer;
    }
    private static boolean isPrime(int n){
        boolean result = false;
        if(n == 1) return true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                result = true;
                break;
            }
        }
        return result;
    }
}
