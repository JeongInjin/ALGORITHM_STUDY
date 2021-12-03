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
        public easy21_MergeTwoSortedLists.ListNode getIntersectionNode(easy21_MergeTwoSortedLists.ListNode headA, easy21_MergeTwoSortedLists.ListNode headB) {
            HashSet<easy21_MergeTwoSortedLists.ListNode> hs = new HashSet<>();

            easy21_MergeTwoSortedLists.ListNode t = headA;
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
