package BOJ.step._11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int average = sum / 5;
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(average).append("\n");
        sb.append(arr[2]);
        System.out.println(sb);

    }
}
