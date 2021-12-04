package LeetCode.Medium;

public class medium2_AddTwoNumbers {

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode focus = result;
            int carry = 0;

            while(l1 != null || l2 != null){
                int x = l1 == null? 0 : l1.val;
                int y = l2 == null? 0 : l2.val;

                int sum = carry + x + y;
                carry = sum / 10;

                focus.next = new ListNode(sum % 10);
                focus = focus.next;

                if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;

            }
            if(carry == 1){
                focus.next = new ListNode(carry);
            }
            return result.next;
        }
    }
}
