package BOJ.easy;

public class 정수N개의합_15596 {
    public class Test {
        long sum(int[] a) {
            long ans = 0;
            for(int i  = 0; i < a.length; i++){
                ans += a[i];
            }
            return ans;
        }
    }
}
