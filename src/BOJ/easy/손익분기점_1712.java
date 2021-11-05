package BOJ.easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 손익분기점_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 고정지출
        int B = Integer.parseInt(st.nextToken()); // 원가
        int C = Integer.parseInt(st.nextToken()); // 판매가

        if(C <= B) System.out.print("-1");
        else System.out.print(A/(C-B) + 1);
    }

}
