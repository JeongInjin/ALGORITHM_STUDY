package Programmers;

import java.util.*;
/*
* 도저히 안풀려서 힌트를 보고풀었다.
* Arrays.sort() 와 Comllection.sort()차이점을 살펴봐야하겠다.
* 또한 Comparator 살펴봐야겠다.
*
* */
public class 가장큰수 {
    public static void main(String[] args){
        int[] numbers = {3,30,34,5,9,0,1,5,9,99,97,80};
        String result = solution(numbers);
        System.out.println(result);
    }
    private static String solution(int[] numbers) {
        String[] number_string = new String[numbers.length];
        for(int i = 0; i < numbers.length ; i++){
            number_string[i] = String.valueOf(numbers[i]);
        }

        //Arrays.sort(number_string, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        Arrays.sort(number_string, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        String answer = "";
        for(int i = 0 ; i < number_string.length ; i++){
            answer += number_string[i];
        }
        if(String.valueOf(answer.charAt(0)).equals("0")){
            return "0";
        }


        return answer;
    }
}
