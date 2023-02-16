package BOJ.step._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(isHansu(num));
    }

    private static int isHansu(int num) {
        if (num < 100) return num;
        int hansu = 99;
        for (int i = 100; i <= num; i++) {
            int hundred = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;
            if ((hundred - ten) == (ten - one)) hansu++;
        }

        return hansu;
    }
}
