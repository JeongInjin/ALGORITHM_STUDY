package BOJ.step._03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        final String STAR = "*";
        final String EMPTY = " ";
        for (int i = 1; i <= count; i++) {
            for (int k = 0; k < count; k++) {
                if (i + k >= count) sb.append(STAR);
                else sb.append(EMPTY);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
