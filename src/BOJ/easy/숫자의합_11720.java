package BOJ.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* charAt - 48 을 하는 이유는 숫자 0 의 아스키코드값은 48, 1 = 49, 2 = 50 - - - 48을 빼줌으로써 숫자를 맞추기위함.
* */
public class 숫자의합_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num_length = Integer.parseInt(br.readLine());
        String readLine = br.readLine();
        int result = 0;

        for(int i = 0 ; i < num_length ; i++){
            result += readLine.charAt(i) - 48;
        }
        System.out.print(result);
    }
}
