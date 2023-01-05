package infcode.before.secssion7_Recursive_Tree_Graph;

import java.util.Scanner;

//재귀함수로 1부터 N까지 출력하는 문제.

/*
재귀함수
자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.

▣ 입력설명
첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.
▣ 출력설명
첫째 줄에 출력한다.
▣ 입력예제 1
3
▣ 출력예제 1
1 2 3
*/

public class quiz_7_1_Main_재귀함수_스택프레임 {
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
        recursive(n - 1);
        System.out.print(n + " ");
    }
}
