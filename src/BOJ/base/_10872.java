package BOJ.base;

import java.util.Scanner;

import static Study.b1.Recursion.factorial;

public class _10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int target = in.nextInt();
        long result = 1;
        for (int i = 1; i <= target; i++) {
            result *= i;
        }
        System.out.println(result);

        System.out.println("======");

        System.out.println(factorial(target));

        System.out.println("======");
        System.out.println(factorialFunc(target));
    }

    private static long factorialFunc(int target) {
        if(target <= 1) return 1;
        return target * factorialFunc(target - 1);
    }
}
