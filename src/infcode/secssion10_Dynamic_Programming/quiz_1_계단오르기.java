package infcode.secssion10_Dynamic_Programming;

import java.util.Scanner;

/*
계단오르기
철수는 계단을 오를 때 한 번에 한 계단 또는 두 계단씩 올라간다. 만약 총 4계단을 오른다면
그 방법의 수는
1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 로 5가지이다.
그렇다면 총 N계단일 때 철수가 올라갈 수 있는 방법의 수는 몇 가지인가?
▣ 입력설명
첫째 줄은 계단의 개수인 자연수 N(3≤N≤35)이 주어집니다.
▣ 출력설명
첫 번째 줄에 올라가는 방법의 수를 출력합니다.
▣ 입력예제 1
7
▣ 출력예제 1
21
 */
//피보나치
/*
public static int fibonacci(int n){
        if(n <= 1) return n;
        else
        return fibonacci(n-2) + fibonacci(n - 1);
    }
*/
public class quiz_1_계단오르기 {
    static int[] dy;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(solution(n));
    }
    private static int solution(int n){
        int answer = 0;
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <=n; i++){
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        answer =  dy[n];
        return answer;
    }
}
