package Study.b1.문자열_숫자;

public class String_Integer {
    public static void main(String[] args){
        int num = 123456789;
        System.out.println(intReverse(num));
    }
    // 숫자 뒤집기
    public static int intReverse(int num){
        if(String.valueOf(num).length() < 1) return num;

        int result = 0;
        while(num != 0){
            result = result * 10 + num % 10;
            num /= 10;
            /*
            System.out.println("result : " + result + ", num : " + num);
            result : 9, num : 12345678
            result : 98, num : 1234567
            result : 987, num : 123456
            result : 9876, num : 12345
            result : 98765, num : 1234
            result : 987654, num : 123
            result : 9876543, num : 12
            result : 98765432, num : 1
            result : 987654321, num : 0
             */
        }
        return result;
    }


}
