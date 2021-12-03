package LeetCode.Easy;

import java.util.HashSet;

public class easy160_IntersectionofTwoLinkedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            HashSet<ListNode> hs = new HashSet<>();

            ListNode t = headA;
            while(t != null){
                hs.add(t);
                t = t.next;
            }

            t = headB;
            while(t != null){
                if(hs.contains(t)) break;
                else t = t.next;
            }

            return t;
        }
    }
}
