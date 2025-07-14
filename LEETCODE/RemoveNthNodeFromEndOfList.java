public class RemoveNthNodeFromEndOfList {
     ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode dummy = new ListNode(-1);
    dummy.next = head;

   

    return dummy.next;
  }
}
