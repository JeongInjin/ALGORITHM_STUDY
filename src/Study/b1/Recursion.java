package Study.b1;

//적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야 함.
//모든 case는 결국 base case 수렴해야 함.
public class Recursion {
    public static void main(String[] args){
        int result1 = factorial(4);
        System.out.println("factorial :" + result1);

        int result2 = fibonacci(8);
        System.out.println("fibonacci :" + result2);

        double result3 = gcd(56, 256);
        System.out.println("gcd :" + result3);

    }
    //팩토리얼
    public static int factorial(int k){
        if(k == 0) return 1;
        else
            return k * factorial( k - 1);

    }
    //피보나치
    public static int fibonacci(int n){
        if(n <= 1) return n;
        else
            return fibonacci(n-2) + fibonacci(n - 1);
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
