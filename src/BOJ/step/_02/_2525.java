package BOJ.step._02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

//        int mt = m + t;
//        int SIXTY_MINUTE = 60;
//
//        int ah = mt / SIXTY_MINUTE;
//        int am = mt % SIXTY_MINUTE;
//
//        if (ah == 0) {
//            m += t;
//        } else {
//            h += ah;
//            m = am;
//            if(h >= 24) h -= 24;
//            if( am == 0) m = 0;
//            if(m >=60) m = am - 60;
//        }

        int o = h * 60 + m + t;
        h = o / 60;
        m = o % 60;

        if(h >= 24) h -= 24;

        sb.append(h).append(" ").append(m);

        System.out.println(sb);
    }
}
