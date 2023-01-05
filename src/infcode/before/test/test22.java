package infcode.before.test;

import java.util.Scanner;

public class test22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, t, arr));
    }
    public static int solution(int n, int t, int[] arr){
        int answer = 0;
        int sum =0;
        int lt = 0;
        int p2 =0;

        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == t) answer++;

            while(sum >= t){
                sum -= arr[lt++];
                if(sum == t) answer++;
            }
        }

        return answer;
    }
}
