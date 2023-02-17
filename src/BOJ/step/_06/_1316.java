package BOJ.step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < count; i++) {
            String s = br.readLine().toUpperCase();
            boolean b = checkStr(s);
            if (b) result++;
        }
        System.out.println(result);
    }

    private static boolean checkStr(String s) {
        boolean[] arr = new boolean[26];
        for (int k = 0; k < s.length() - 1; k++) {
            char c = s.charAt(k);
            arr[c - 'A'] = true;
            char cc = s.charAt(k + 1);
            if (c != cc) {
                if (arr[cc - 'A']) {
                    return false;
                }
            }
        }
        return true;
    }
}
