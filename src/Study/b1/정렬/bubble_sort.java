package Study.b1.정렬;

import java.util.Arrays;

/*
* 버블정렬
* 두 개의 인접한 원소를 비교하여 오른쪽 끝부터 정렬하는 방식
* 쉽다. 하지만 느리다.
* 1회전을 수행하고 나면 가장 큰 자료가맨 뒤로 이동한다.
* O(n제곱) - 이차 시간(quadratic time)으로도 불린다.
* (N -1 ) + (N -2 ) + (N - 3 ) + ' ' '  + 1번의 비교를 수행
* */
public class bubble_sort {
    public static void main(String[] args){
        int[] array = {65, 55, 45, 33, 21, 56, 77, 12}; // 테스트 값
        bubble_sort(array);
    }

    private static void bubble_sort(int[] array){
        for(int i = 1 ; i < array.length ; i++){ // 전체 길이만큼 반복한다
            for(int k =  0; k < array.length - i ; k++){ // 처음부터 수행한 만큼을 뺀 길이를 반복한다.
                if(array[k] > array[k+1]){ // temp 임시공간에 변경할 값을 잠시 넣어두고 스왑한다.
                    swapValue(array, k, k+1);
                }
            }
            System.out.println(i + " 회차 " + Arrays.toString(array));
        }
        System.out.println("최종 정렬 : " + Arrays.toString(array));
    }

    private static void swapValue(int[] array, int i, int k) {
        int tmp = array[i];
        array[i] = array[k];
        array[k] = tmp;
    }
}
