package BOJ.step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798 {
    public static void main(String[] args) throws IOException {
        String[][] arr = new String[5][15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int k = 0; k < s.length(); k++) {
                arr[i][k] = String.valueOf(s.charAt(k));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < 15; k++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][k] != null) {
                    sb.append(arr[i][k]);
                }
            }
        }
        System.out.println(sb);
    }
}
