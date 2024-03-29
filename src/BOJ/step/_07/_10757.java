package BOJ.step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger ba = new BigInteger(st.nextToken());
        BigInteger bb = new BigInteger(st.nextToken());

        System.out.println(ba.add(bb));
    }
}
