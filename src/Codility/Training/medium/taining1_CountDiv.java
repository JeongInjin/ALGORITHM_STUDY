package Codility.Training.medium;
/*
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
 */
//한참 멀었구나..............
//값을 연산하여 먼저 뽑는거보다 바로 계산하는게 좋은듯......
//수학이라 말하기도 뭐한..산수 공부를 더 해야겠다....허매...


public class taining1_CountDiv {
    //score 100%
    class Solution {
        public int solution(int A, int B, int K) {
            int result = 0;
            result = (B / K) - (A / K);
            if(A % K == 0) result++;

            return result;
        }
    }
    //score 87%
    /*
    class Solution {
        public int solution(int A, int B, int K) {
            int result = 0;
            if(A % K == 0) result++;
            if(A != K){
                int first = A / K;
                int second = B / K;

                result += second - first;
            }

            return result;
        }
    }
     */
}
