package Study.b1;

import infcode.secssion7_Recursive_Tree_Graph.quiz_7_4_Main_재귀_메모이제이션;

//적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야 함.
//모든 case는 결국 base case 수렴해야 함.
public class Recursion {
    public static void main(String[] args){
        int result1 = factorial(4);
        System.out.println("factorial :" + result1);

        int result2 = fibonacci(8);
        System.out.println("fibonacci :" + result2);

        int result4 = fibonacci_improvement(5);
        System.out.print("fibonacci_improvement : ");
        for(int i = 1; i <= 5; i++) System.out.print(fibo[i] + " ");
        System.out.println("");


        double result3 = gcd(56, 256);
        System.out.println("gcd :" + result3);

    }
    //팩토리얼
    //* 5 = 5 * 4 * 3 * 2 * 1 = 120.
    public static int factorial(int k){
        if(k == 1) return 1;
        else
            return k * factorial( k - 1);
        //for문으로 팩토리얼
        /*
        int result = 1;
        if(startNumber == 1) return result;
        else {
            for(int i = 1; i <= startNumber; i++){
                result = result * i;
            }
        }
        return result;
        */

    }
    //피보나치
    public static int fibonacci(int n){
        if(n <= 1) return n;
        else
            return fibonacci(n-2) + fibonacci(n - 1);
    }
    //피보나치 개선 - 메모이제이션
    static int[] fibo = new int[6];
    public static int fibonacci_improvement(int n){
        if(fibo[n] >0) return fibo[n];
        if(n <= 2) return fibo[n] = 1;
        return fibo[n] = fibonacci_improvement(n-2) + fibonacci_improvement(n-1);
    }

    //최대공약수
    public static double gcd(int m , int n){
        if(m < n){
            //swap m and n
            int tmp = m;
            m=n;
            n = tmp;
        }
        if(m % n == 0){
            return n;
        }else
            return gcd(n, m%n);
    }
}
