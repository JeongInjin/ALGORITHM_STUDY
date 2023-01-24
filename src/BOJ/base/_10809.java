package BOJ.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(s.indexOf(c)).append(" ");
        }
        System.out.println(sb);
    }
}
