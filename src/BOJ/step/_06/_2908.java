package BOJ.step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class _2908 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        StringBuilder arnum = new StringBuilder(String.valueOf(a));
//        int reverseA = Integer.parseInt(arnum.reverse().toString());
//
//        int b = Integer.parseInt(st.nextToken());
//        StringBuilder brnum = new StringBuilder(String.valueOf(b));
//        int reverseB = Integer.parseInt(brnum.reverse().toString());
//        int max = Math.max(reverseA, reverseB);
//
//
//        System.out.print(max);
//    }
//}

public class _2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int reverseA = reverseInt(a);
        int reverseB = reverseInt(b);

        int max = Math.max(reverseA, reverseB);
        System.out.println(max);
    }

    private static int reverseInt(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}