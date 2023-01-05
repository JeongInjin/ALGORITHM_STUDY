package infcode.before.secssion1_String;
import java.util.Scanner;
public class quiz_1_1_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.print(solution(str, t));
    }
    public static int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
        for(Character v : str.toCharArray()){
            if(v == t) answer++;
        }
        return answer;
    }
}
