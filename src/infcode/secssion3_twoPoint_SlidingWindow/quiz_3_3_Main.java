package infcode.secssion3_twoPoint_SlidingWindow;

import java.util.Scanner;

public class quiz_3_3_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a=new int[n];
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        System.out.print(solution(n, m, a));
    }
    public static int solution(int n, int m, int[] a){
        int answer = 0;
        int compare = 0;

        for(int i = 0; i < m; i++) answer += a[i];
        compare = answer;

        for(int i = m; i < n - 1; i++){
            compare += (a[i]-a[i-m]);
            answer = Math.max(answer, compare);
        }
        return answer;
    }
}
