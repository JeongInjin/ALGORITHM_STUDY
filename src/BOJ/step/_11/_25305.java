package BOJ.step._11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[count];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(s.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[limit - 1]);
    }
}
