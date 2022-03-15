public class Remove_Nth_Node_From_End_Of_List {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head, lagged = null;
        int i = 0;
        while(current != null){
            if(i == n)
                if(lagged == null)
                    lagged = head;
                else lagged = lagged.next;
            else i++;
            current = current.next;
        }

        if(lagged == null)
            head = head.next;
        else if(lagged.next != null)
            lagged.next = lagged.next.next;
        else return null;
        return head;
    }

}
