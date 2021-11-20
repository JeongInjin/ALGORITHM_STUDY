package infcode.secssion7_Recursive_Tree_Graph;

import java.util.Scanner;

/*
팩토리얼
자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
예를 들어 5! = 5*4*3*2*1=120입니다.
▣ 입력설명
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
▣ 출력설명
첫 번째 줄에 N팩토리얼 값을 출력합니다.
▣ 입력예제 1
5
▣ 출력예제 1
120
*/


public class quiz_7_3_Main_팩토리얼 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    public static void solution(int n){
        System.out.print(recursive(n));
    }

    public static int recursive(int n){
        if(n == 1) return 1;
        return n * recursive(n-1);
    }
}
