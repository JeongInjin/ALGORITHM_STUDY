package BOJ.step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            System.out.println(1);
            return;
        }

        int start = 2;
        int count = 1;
        while (start <= num) {
            start += (6 * count);
            count++;
        }
        System.out.println(count);
    }
}
