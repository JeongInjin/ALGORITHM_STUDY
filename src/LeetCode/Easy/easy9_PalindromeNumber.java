package LeetCode.Easy;
/*
* 숫자로 reverse 하는게 더 빠르다.
* 허허..0 일경우 else if로 처리안해줬었네..조심하자-.-
* */
public class easy9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if((int)x < 0) return false;
        else if((int)x == 0) return true;

        int num = x;
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if(x == reverse) return true;
        else return false;
    }
}
