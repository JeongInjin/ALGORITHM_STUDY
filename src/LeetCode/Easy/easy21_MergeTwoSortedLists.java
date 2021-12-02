package LeetCode.Easy;
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class easy21_MergeTwoSortedLists {
    public static void main(String[] args){

    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static ListNode Solution(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode firstNode = new ListNode(0);
        ListNode nextNode = firstNode;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                nextNode.next = l2;
                l2 = l2.next;
            } else {
                nextNode.next = l1;
                l1 = l1.next;
            }
            nextNode = nextNode.next;
        }

        if (l1 == null) {
            nextNode.next = l2;
        }
        if (l2 == null) {
            nextNode.next = l1;
        }

        return firstNode.next;
    }
}
