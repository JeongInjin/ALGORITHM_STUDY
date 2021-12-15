package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {

    //효율이 젤 좋은듯..map 보다 set 이 더 나을거라는 생각했는데 아니라는 얘기도 있다..확인해봐야할듯.
    class Solution {
        public boolean solution(String[] phone_book) {
            Arrays.sort(phone_book);
            int length = phone_book.length;

            Map<String, String> map = new HashMap<String, String>();

            for(String temp : phone_book){
                map.put(temp, temp);
            }

            for(String str : phone_book){
                for(int index = 0; index < str.length(); index++){
                    String temp = str.substring(0, index);
                    if( map.containsKey( temp ) ){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    //효율이 생각보다 안좋은듯..하다..
    public boolean solution(String[] phoneBook) {
        for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }


    //1차 실패코드 - 효율똥망
    class Solution1 {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            for(int i = 0; i < phone_book.length; i++){
                for(int k = 0; k < phone_book.length; k++){
                    if(i != k && phone_book[i].length() <= phone_book[k].length()){
                        if(phone_book[k].contains(phone_book[i])) return false;
                    }
                }
            }
            return answer;
        }
    }
}
