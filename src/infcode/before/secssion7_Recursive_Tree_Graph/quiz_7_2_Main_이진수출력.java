package infcode.before.secssion7_Recursive_Tree_Graph;

import java.util.Scanner;

/*
재귀함수를 이용한 이진수 출력
10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용
해서 출력해야 합니다.
▣ 입력설명
첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
▣ 출력설명
첫 번째 줄에 이진수를 출력하세요.
▣ 입력예제 1
11
▣ 출력예제 1
1011
*/


public class quiz_7_2_Main_이진수출력 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    public static void solution(int n){
        recursive(n);
    }

    public static void recursive(int n){
        if(n == 0) return;
        recursive(n / 2);
        System.out.print(n % 2);
    }
    //이진수 구하기
    /*
    int[] b = new int[10];
        int i = 0;
        while(N != 1){
            b[i++] = N % 2;
            N = N / 2;
        }
        b[i] = N;

        for(int k = i; k >= 0; k--){
            System.out.print(b[k]);
        }
        return 0;
     */
}

