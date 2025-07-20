public class SwapNodesInPairs {
   ListNode swapPairs(ListNode head) {

    // Create a dummy node to ease things
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode point = dummy;


    // Return the start node
    return dummy.next;
  }
}
