public class RemoveNthNodeFromEndOfList {
     ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode firstPtr = dummy;
    ListNode secondPtr = dummy;

    // Move secondPtr n spaces ahead
    for (int i = 0; i < n; i++) {
      secondPtr = secondPtr.next;
    }

    // Move both now, until the next of secondPtr is null
    while(secondPtr.next != null) {
      firstPtr = firstPtr.next;
      secondPtr = secondPtr.next;
    }

   

    return dummy.next;
  }
}
