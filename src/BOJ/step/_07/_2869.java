package BOJ.step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int stop_down = goal - down;
        int up_down = up - down;
        int day = stop_down / up_down;

        if ((stop_down) % (up_down) != 0)
            day++;

        System.out.println(day);
    }
}
