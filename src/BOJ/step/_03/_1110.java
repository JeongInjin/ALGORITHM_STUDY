package BOJ.step._03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int copy = N;
        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (copy != N);

        System.out.println(cnt);
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String origin = br.readLine();
//        String cv = origin;
//        int count = 0;
//        if (Integer.parseInt(cv) < 10) cv = "0" + cv;
//        while (true) {
//            String cvSum = String.valueOf((cv.charAt(0) - '0') + (cv.charAt(1) - '0'));
//            cvSum = String.valueOf(cvSum.charAt(cvSum.length() - 1) - '0');
//            cv = (cv.charAt(cv.length() - 1) - '0') + cvSum;
//            count++;
//            if (origin.equals(String.valueOf(Integer.parseInt(cv)))) break;
//        }
//        System.out.println(count);
//    }
}
