package Study.b1.정렬;

import java.util.Arrays;
/*
* 삽입정렬
* 임시의 인덱스 1번 값을 저장후 반복문을 돌며
* 자신의 왼쪽 공간 인덱스 중 자신보다 큰 원소를 만날때 마다 교환을 한다.
* 시간복잡도는 O(n제곱)을 갖는다.
* 거의 정렬된 경우 매우 효율적으로 최선의 경우 O(n)을 가진다.
* 하지만 역순에 가까울 수록 매우 비효율적이다.
* */
public class insertion_sort {
    public static void main(String[] args){
        int[] array = {65, 55, 45, 33, 21, 56, 77, 12}; // 테스트 값
        insertionSort(array);
    }

    private static void insertionSort(int[] array) {
        for(int i = 1 ; i < array.length ; i++){
            int stdValue = array[i]; // 기준이 될 숫자
            int compareIndex  = i - 1 ; // 비교할 숫자

            while(compareIndex >= 0 && stdValue < array[compareIndex]){ // 55(1) < 65(0)
                array[compareIndex + 1] = array[compareIndex];
                compareIndex--;
            }
            array[compareIndex + 1] = stdValue;
            System.out.println(i + " 회차 " + Arrays.toString(array));
        }
        System.out.println("최종 정렬 : " + Arrays.toString(array));
    }
}
