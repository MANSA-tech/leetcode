/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //apan log isme head ko access ni kr skte toh direct node ki value leke solve krdete hai aur node pe jake usse hatane k liye uski value ko change krke aage wali usme dalte hai
     node.val=node.next.val;
     node.next= node.next.next;

        
        
    }
}