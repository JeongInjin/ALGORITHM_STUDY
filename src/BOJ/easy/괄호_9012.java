package BOJ.easy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class 괄호_9012 {
    static HashMap<Character, Character> m = new HashMap<>();
    static{
        m.put(')', '(');
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        for(String s : solution(arr)){
            System.out.println(s);
        }
    }

    private static String[] solution(String[] arr) {
        String[] result = new String[arr.length];
        char ps = '(';
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            char[] c = arr[i].toCharArray();
            if(c.length % 2 != 0)   result[i] = "NO";
            else{
                for(int k = 0; k < c.length; k++){
                    if(c[k] == ps) s.push(c[k]);
                    else if(s.isEmpty()) result[i] = "NO";
                    else s.pop();
                }
                if(result[i] == null){
                    if(s.isEmpty()) result[i] = "YES";
                    else result[i] = "NO";
                }
                s.clear();
            }
        }

        return result;
    }
}
