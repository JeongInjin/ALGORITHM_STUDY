package BOJ.step._01;

import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        char[] chars = String.valueOf(B).toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            int n = chars[i] - '0';
            sb.append(A * n).append("\n");
        }
        sb.append(A * B);
        System.out.println(sb);
    }
}
