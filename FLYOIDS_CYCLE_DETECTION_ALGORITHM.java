public class FLYOIDS_CYCLE_DETECTION_ALGORITHM {

}
//**
//        * Definition for singly-linked list.
//        * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        ListNode slow = head,fast = head;       // use two pointers(TORTOISE , RABBIT) one who jumps one node and another one jumps two .if it meets at the same point the linked list is in rounded loop not contain end
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                return true;
//            }
//        }
//        return false;
//    }
//}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        ListNode slow = head,fast = head;
//        while(slow != null && fast != null && fast.next != null){   // used to find which node is the starting point of the rounded loop
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                slow = head;
//                while(slow != fast){
//                    slow = slow.next;
//                    fast = fast.next;
//                }
//                return slow;
//            }
//        }
//        return null;
//    }
//}



