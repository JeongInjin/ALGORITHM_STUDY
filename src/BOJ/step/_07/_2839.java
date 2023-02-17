package BOJ.step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = -1;

        for (int i = num / 5; i >= 0; i--) {
            int remain = num - (i * 5);
            if (remain % 3 == 0) {
                count = i + (remain / 3);
                break;
            }
        }
        System.out.println(count);
    }
}
