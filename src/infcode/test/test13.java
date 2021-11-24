package infcode.test;

import java.util.Random;

public class test13 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; // 테스트 값
        int targetValue = new Random().nextInt(19) + 1; // 찾을 값

        System.out.println(solution(targetValue, arr));
    }
    private static int solution(int targetValue, int[] arr){
        int sn = 0;
        int mn = arr.length;

System.out.println(targetValue);
        int answer = -1;
        while(sn <= mn){
            int mid = (sn + mn) / 2;

            if(arr[mid] == targetValue){
                answer = mid;
                return answer;
            }else{
                if(arr[mid] < targetValue){
                     sn = mid + 1;
                }else{
                    mn = mid - 1;
                }
            }
        }
        return answer;
    }
}
