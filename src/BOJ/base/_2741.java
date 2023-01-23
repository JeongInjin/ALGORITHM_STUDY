package BOJ.base;

import java.util.Scanner;

public class _2741 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int target = in.nextInt();
        if (target > 0) {
            for (int i = 1; i <= target; i++) {
                System.out.println(i);
            }
        }

        System.out.println("=======");

        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <= target; i++) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
