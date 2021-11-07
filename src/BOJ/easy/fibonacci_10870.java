package BOJ.easy;

import java.util.Scanner;

public class fibonacci_10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = fibonacci(n);
        System.out.print(result);
    }

    private static int fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
