package infcode.before.secssion1_String;

import java.util.Scanner;

public class quiz_1_12_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        System.out.print(solution(n, str));
    }

    // #****###**#####**#####**##**
    public static String solution(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num=Integer.parseInt(tmp, 2);
            answer+=(char)num;
            s=s.substring(7);
        }
        return answer;
    }
}
