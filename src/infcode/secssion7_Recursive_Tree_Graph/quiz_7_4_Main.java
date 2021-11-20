package infcode.secssion7_Recursive_Tree_Graph;

import java.util.Scanner;

/*
피보나치 수열 - 메모이제이션
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는
수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면
된다.
▣ 입력설명
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
▣ 출력설명
첫 줄에 피보나치 수열을 출력합니다.
▣ 입력예제 1
10
▣ 출력예제 1
1 1 2 3 5 8 13 21 34 55
*/

/*배열을 이용한 일반 피보나치*/
//public class quiz_7_4_Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++) System.out.print(recursive(i) + " ");
//    }
//
//    public static int recursive(int n){
//        if(n <= 1) return n;
//
//        return recursive(n - 1) + recursive( n - 2);
//    }
//}

/*
* 1차개션
* */
/*public class quiz_7_4_Main {
    static int[] fibo;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n+1];
        recursive(n);
        for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }

    public static int recursive(int n){
        if(n <= 2) return fibo[n] = 1;
        return fibo[n] = recursive(n-2) + recursive(n-1);
    }
}*/

/*
 * 2차개션 - 메모리제이션
 * */
public class quiz_7_4_Main {
    static int[] fibo;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n+1];
        recursive(n);
        for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }

    public static int recursive(int n){
        if(fibo[n] >0) return fibo[n];
        if(n <= 2) return fibo[n] = 1;
        return fibo[n] = recursive(n-2) + recursive(n-1);
    }
}