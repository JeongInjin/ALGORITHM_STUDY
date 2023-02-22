package BOJ.step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int blank = ((2 * num) - 1) / 2;
        int start = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            for (int b = 0; b < blank; b++) {
                sb.append(" ");
            }
            for (int s = 0; s < start; s++) {
                sb.append("*");
            }
            sb.append("\n");
            blank -= 1;
            start += 2;
        }
        blank += 2;
        start -= 4;
        for (int i = num - 2; i >= 0; i--) {
            for (int b = 0; b < blank; b++) {
                sb.append(" ");
            }
            for (int s = 0; s < start; s++) {
                sb.append("*");
            }
            sb.append("\n");
            blank += 1;
            start -= 2;
        }
        System.out.println(sb);
    }
}
