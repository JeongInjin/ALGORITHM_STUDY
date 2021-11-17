package infcode.secssion3_twoPoint_SlidingWindow;

import java.util.Scanner;

public class quiz_3_4_Main {
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
    public static int solution(int n, int t, int[] a){
        int answer = 0;
        int lt = 0;
        int sum = 0;
        for(int rt = 0; rt < n; rt++){
            sum += a[rt];
            if(sum == t) answer++;
            while (sum >= t){
                sum -= a[lt++];
                if(sum == t) answer++;
            }
        }
        return answer;
    }
}
