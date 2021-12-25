package Codility.Training.easy;

import java.util.Arrays;

public class training1_Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);

        for(int i = 0; i < A.length - 2; i++){
            if(A[i+1] > A[i+2] - A[i]) return 1;
        }
 ㄹ 
        return 0;
    }
}
