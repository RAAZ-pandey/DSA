public class MergeTwoSortedList {
  
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    // Create a sentinal/dummy node to start
    ListNode returnNode = new ListNode(Integer.MIN_VALUE);

    // Create a copy of this node to iterate while solving the problem
    ListNode headNode = returnNode;


    // return the next node to sentinal node
    return headNode.next;
  }
}
