package infcode.before.test;

import java.util.Scanner;

/*
슬라이딩 윈도우
 */
public class test21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int compare = 0;
        for(int i = 0; i < m; i++){
            answer += arr[i];
        }
        compare = answer;

        for(int i = m; i < n-1; i++){
            compare += (arr[i] - arr[i-m]);
            answer = Math.max(answer, compare);
        }

        return answer;
    }
}
