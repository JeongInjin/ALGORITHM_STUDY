package BOJ.step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int repeatCount = Integer.parseInt(input[0]);
            String str = input[1];
            for (int k = 0; k < str.length(); k++) {
                char c = str.charAt(k);
                for (int q = 0; q < repeatCount; q++) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
