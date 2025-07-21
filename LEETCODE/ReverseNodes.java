public class ReverseNodes{
    public ListNode reverseKGroup(ListNode head, int k) {
        //  int count =0;
        // ListNode dummy = new ListNode();
        // dummy.next = head;
        
        // ListNode temp = dummy;
        
        // while(temp.next!=null){
        //     temp = temp.next;
        //     count++;
        // }
        // temp = dummy;
        // while(temp.next!=null){
        //     if(count<k) break;
        //     int nodes = k-1;
        //     ListNode tempnext = temp.next;
        //     ListNode first = temp.next;
        //     ListNode second = first.next;
            
        //     while(nodes-- > 0){
        //         ListNode next = second.next;
        //         second.next = first;
        //         first = second;
        //         second = next;
        //     }
        //     count-=k;
        //     temp.next = first;
        //     tempnext.next = second;
        //     temp = tempnext;
            
        // }
        // return dummy.next;

        //Best Approach with O(n) time complexicity

        ListNode t = head;
        ListNode curr = head;
        ListNode prev = head;

        int cnt =0;

        while( t!= null && cnt < k){
            t = t.next;
            cnt ++;
        }



        head.next = reverseKGroup(curr, k);

        return prev;
    }
}