package BOJ.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hanoiTower {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        sb.append((int)(Math.pow(2, N)-1)).append('\n');
        Hanoi(N,1,2,3);
        System.out.println(sb);
    }

    /*
     * N : 원판갯수, start : 이동 전 위치, mid : 이동할 위치, to : 이동 후 위치
     */
    public static void Hanoi(int N, int start, int mid, int to) {

        if(N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // 1. N-1개를 A에서 B로 이동
        Hanoi(N-1, start, to, mid);

        // 2. 1개를 A에서 C로 이동
        sb.append(start + " " + to + "\n");

        // 3. N-1개를 B에서 C로 이동
        Hanoi(N-1, mid, start, to);
    }
}
