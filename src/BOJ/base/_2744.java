package BOJ.base;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}
