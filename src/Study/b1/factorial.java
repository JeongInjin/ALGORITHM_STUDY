package Study.b1;

/*
* 재귀를 이용한 팩토리얼를 구한다.
* 5 = 5 * 4 * 3 * 2 * 1 = 120.
* 재귀코드를 읽는 방법은
* 1.기저 조건이 무엇인지 찾아본다.
* 2기저 조건을 다룬다는 가정하에 함수를 살펴본다.
* 3.기저 조건 바로 전 조건을 다룬다는 가정하에 함수를 살펴본다.
* 4.한 번에 한 조건씩 올라가면서 계속 분석한다.
* */
public class factorial {
    public static void main(String[] args){        
        int startNumber = 5;
        System.out.print(factorial(startNumber));
    }   
    private static int factorial(int startNumber){
        if(startNumber == 1) return 1;
        else return startNumber * factorial(startNumber -1);
    }
}
