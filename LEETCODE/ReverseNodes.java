public class ReverseNodes{
    public ListNode reverseKGroup(ListNode head, int k) {
         int count =0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode temp = dummy;
        
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
       
        return dummy.next;
    }
}