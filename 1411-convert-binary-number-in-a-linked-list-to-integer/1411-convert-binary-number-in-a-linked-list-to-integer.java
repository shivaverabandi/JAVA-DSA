/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0, len = 0;
        ListNode curr = head;

        // step 1 : find length
        while(curr != null){ 
            len++;
            curr = curr.next;
        }
        // step 2 : convert to integer
        curr = head; // update curr to make ans
        while(len > 0){
            ans += (curr.val * (int)Math.pow(2,len-1));
            curr = curr.next;
            len--;
        }
        return ans;
    }
}