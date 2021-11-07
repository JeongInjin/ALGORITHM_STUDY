package BOJ.easy;

import java.util.Scanner;

public class factorial_10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = factorial(n);
        System.out.print(result);
    }
    private static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}
