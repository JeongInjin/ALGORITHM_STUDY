package BOJ.base;

import java.util.Scanner;

public class _2420 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        long M = in.nextLong();

        System.out.println(Math.abs(N - M));
    }
}
