import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKLists {
   public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        Queue<ListNode> minHeap= new PriorityQueue<ListNode>((a, b) -> a.val - b.val);
        for(ListNode temp : lists){
            if(temp != null) minHeap.add(temp);
        }
        
        if(curr != null) curr.next = null;
        return head.next;
    }
}
