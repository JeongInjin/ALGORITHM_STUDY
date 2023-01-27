package BOJ.step._02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        if (m >= 45) {
            m -= 45;
        } else {
            h -= 1;
            m = 60 - (45 - m );
            if(h < 0) h = 23;
        }
        sb.append(h).append(" ").append(m);
        System.out.println(sb);
    }
}
