package BOJ.step._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 1, 2, 2, 2, 8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            int s = Integer.parseInt(st.nextToken());
            sb.append(arr[i] - s).append(" ");
        }
        System.out.println(sb);
    }
}
