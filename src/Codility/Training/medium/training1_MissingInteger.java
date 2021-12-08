package Codility.Training.medium;
/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

import java.util.*;
//set 을 이용했다.
public class training1_MissingInteger {
    class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            if(A[A.length - 1] <= 0) return 1;

            HashSet<Integer> hs = new HashSet<>();

            for(int i = 0; i < A.length; i++){
                hs.add(A[i]);
            }

            for(int i = 1; i < Integer.MAX_VALUE; i++){
                if(!hs.contains(i)) return i;
            }
            return 0;
        }
    }
}
