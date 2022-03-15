public class Add_Two_Numbers {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sentinel = new ListNode(0, null);
        ListNode current = sentinel;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = 0;
            if(sum >= 10) {
                sum -= 10;
                carry = 1;
            }
            current.next = new ListNode(sum, null);
            current = current.next;
        }

        if(carry > 0)
            current.next = new ListNode(carry, null);
        return sentinel.next;

    }

}
