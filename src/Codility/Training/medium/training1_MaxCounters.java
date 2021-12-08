package Codility.Training.medium;

import java.util.*;
/*
import java.util.*;
class Solution {
    public int[] solution(int N, int[] A) {
        int[] arr = new int[N];

        int valueMax = 0;
        for(int i = 0; i < A.length; i++){
            //System.out.println(A[i]);
            if(A[i] > N){
                //System.out.println("valueMax : " + valueMax);
                Arrays.fill(arr, valueMax);
            }else{
                //System.out.println("A[i] - 1 : " + (A[i] - 1));
                arr[A[i] - 1] = arr[A[i] - 1] + 1;
                if(arr[A[i] - 1] >valueMax) valueMax = arr[A[i] - 1];
            }

        }

        return arr;
    }
}
 */
public class training1_MaxCounters {
//score 100% 나옴 valueMax를 찾았을시 fill함수로 업데이트를 일괄로 하는게아니라 추후 찾아서 for 문을 한번 더 돌림
    class Solution {
        public int[] solution(int N, int[] A) {
            int[] arr = new int[N];
            int valueMax = 0;
            int tmp = 0;

            for(int i = 0; i < A.length; i++){
                //System.out.println(A[i]);
                if(A[i] > N){
                    //System.out.println("valueMax : " + valueMax);
                    //Arrays.fill(arr, valueMax);
                    valueMax = tmp;
                }else{
                    //System.out.println("A[i] - 1 : " + (A[i] - 1));
                    arr[A[i] - 1] = Math.max(valueMax, arr[A[i]-1]) + 1; // 1씩 증가
                    if(arr[A[i] - 1] > tmp) tmp = arr[A[i] - 1];
                }
            }
            for (int i = 0; i < N; i++) {
                if(arr[i] < valueMax) arr[i] = valueMax;
            }


            return arr;
        }
    }

    //아래는 score 77% 나옴..
    //정답은 전부 맞으나 랜덤숫자로 뽑은 긴 문자열은 타입아웃이 떨어짐..
    /*
    class Solution {
        public int[] solution(int N, int[] A) {
            int[] arr = new int[N];

            int valueMax = 0;
            for(int i = 0; i < A.length; i++){
                //System.out.println(A[i]);
                if(A[i] > N){
                    //System.out.println("valueMax : " + valueMax);
                    Arrays.fill(arr, valueMax);
                }else{
                    //System.out.println("A[i] - 1 : " + (A[i] - 1));
                    arr[A[i] - 1] = arr[A[i] - 1] + 1;
                    if(arr[A[i] - 1] >valueMax) valueMax = arr[A[i] - 1];
                }
            }

            return arr;
        }
    }
    */
}
