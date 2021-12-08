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


    //아래는 score 77% 나옴..
    //정답은 전부 맞으나 랜덤숫자로 뽑은 긴 문자열은 타입아웃이 떨어짐..
    //O(n)이 맞는거같은데..효율적인 방법을 찾아봐야겠음..

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
}
