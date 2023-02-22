package BOJ.step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566 {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[10][10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int row = 0, column = 0;
        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k = 1; k < 10; k++) {
                int value = Integer.parseInt(st.nextToken());
                arr[i][k] = value;
                if (max < value) {
                    max = value;
                    row = i;
                    column = k;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
