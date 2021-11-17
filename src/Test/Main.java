package Test;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; // 테스트 값
        int targetValue = new Random().nextInt(19) + 1; // 찾을 값

        System.out.print(targetValue + "  :  " +binarySearch(arr, targetValue)); // 호출
    }
    private static int binarySearch(int[] arr, int targetValue){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high){
            mid = (low + high) / 2;
            if(targetValue == arr[mid]){
                return mid;
            }else if(targetValue < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }


}

