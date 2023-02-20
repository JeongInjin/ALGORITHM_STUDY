package BOJ.step._08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2581 {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        prime = new boolean[N + 1];
        prime[0] = true;
        prime[1] = true;

        isPrime();

        // 소수 합 및 최솟값
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = M; i <= N; i++) {
            if (prime[i] == false) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }


    // 에라토스테네스 체 알고리즘
    public static void isPrime() {
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}