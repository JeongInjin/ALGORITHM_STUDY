package Codility.Training;
import java.util.*;

public class training1_TapeEquilibrium {
    /*
    뭐지..아래코드는 score 84점 받음..하--;;
     */
    class Solution {
        /*
        public int solution(int[] A) {
            int answer = Integer.MAX_VALUE;
            int total = 0;
            for(int i = 0; i < A.length; i++){
                total += A[i];
            }
            int sumLeft = 0;
            int sumRight = total;
            for(int i = 0; i < A.length; i++){
                sumLeft += A[i];
                sumRight -= A[i];
                answer = Math.min(answer, Math.abs(sumLeft - sumRight));
            }
            return answer;
        }
        */
        /*
        수정분!!!!!
        허매...Math.min 을 계속 하는거보다 if 로 분기처리해야지 더 좋음
         */
        public int solution(int[] A) {
            int answer = Integer.MAX_VALUE;
            int total = 0;
            for(int i = 0; i < A.length; i++){
                total += A[i];
            }
            int sumLeft = 0;
            int sumRight = total;
            for(int i = 0; i < A.length - 1; i++){
                sumLeft += A[i];
                sumRight -= A[i];
                int diff = Math.abs(sumLeft - sumRight);
                if(answer > diff) answer = diff;
            }
            return answer;
        }
    }

}
