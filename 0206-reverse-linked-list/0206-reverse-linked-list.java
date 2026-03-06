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
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode temp = head;
        ListNode next ;
        while( temp!= null){
            next = temp.next; // prev temp next ...
            // phle next ko store krvao temp k next mai...ab jo temp,next hai uskp prev vale se linked krvao fr prev or next dono ko aage aage badha do toh fr loop chlega continue.....
            temp.next = prev;
            prev = temp;
            temp = next;
    }
    return prev;//return prev hoga kyuki first value prev thi
}
}