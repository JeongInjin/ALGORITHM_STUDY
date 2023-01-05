package infcode.before.secssion3_twoPoint_SlidingWindow;

import java.util.Scanner;
/*
최대 매출
현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속
된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 15 11 20 25 10 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.
▣ 입력설명
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
▣ 출력설명
첫 줄에 최대 매출액을 출력합니다.
▣ 입력예제 1
10 3
12 15 11 20 25 10 20 19 13 15
▣ 출력예제 1
56
 */
public class quiz_3_3_Main_SlidingWIndow {
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
