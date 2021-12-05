package Codility;

import java.util.Arrays;

public class training1_BinaryGap {

    //Integer.toBinaryString 잊어 먹지 말아야겠다.
    class Solution {
        public int solution(int N) {
            String binaryString = Integer.toBinaryString(N);

            char[] c = binaryString.toCharArray();

            int result = 0;
            int gap = 0;
            for(Character x : c){
                if(x == '0'){
                    gap++;
                }else{
                    result = Math.max(result, gap);
                    gap = 0;
                }
            }


            return result;
        }
    }


    //아래는 그냥 풀어봤는데 score 똥점수 나와서..좀 찾아봐야겠음..
    //WRONG ANSWER 과 RUNTIME ERROR이 넘처흐름..
//    class Solution {
//        public int solution(int N) {
//            //2진수 변환
//            String binaryString = binaryToString(N);
//            //System.out.println("binaryString : " + binaryString);
//            int answer = gapResult(binaryString);
//            //System.out.println("answer : " + answer);
//            return answer;
//        }
//
//        public String binaryToString(int N){
//            //이진수 담을 배열 N is an integer within the range [1..2,147,483,647].
//            int[] b = new int[11];
//            int i = 0;
//            while(N != 1){
//                b[i++] = N % 2;
//                N = N / 2;
//            }
//            b[i] = N;
//
//            int[] arr = new int[i + 1];
//            int r = 0;
//            for(int k = i; k >= 0; k--){
//                //System.out.print(b[k]);
//                arr[r++] = b[k];
//            }
//            String result = Arrays.toString(arr).replaceAll("[^0-9]","");
//
//            return result;
//        }
//
//        public int gapResult(String bs){
//            int result = 0;
//            int start = 0;
//            int end = 0;
//            for(int i = 0; i < bs.length(); i++){
//                if(start == 0 && Character.getNumericValue(bs.charAt(i)) == 1){
//                    start = i + 1;
//                    //System.out.println("start : " + start);
//                }
//                else{
//                    if(Character.getNumericValue(bs.charAt(i)) == 1){
//                        end = i;
//                        //System.out.println("end : " + end);
//                    }
//                }
//
//                if(start != 0 && end != 0){
//                    result = Math.max(result, end - start);
//                    start = end;
//                    end = 0;
//                    //System.out.println(result);
//                }
//            }
//            return result == 1 ? 0 : result;
//        }
//    }
}
