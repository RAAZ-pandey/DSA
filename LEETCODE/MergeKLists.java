import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKLists {
   public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        
        if(curr != null) curr.next = null;
        return head.next;
    }
}
