public class Swap_Nodes_In_Pairs {


     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        current = swapPairs(head);
        System.out.println();
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }

    }

    public static ListNode swapPairs(ListNode head) {
        ListNode next, current = head, newHead = null, prev = null;

        while(current != null && current.next != null){
            next = current.next;
            if(newHead == null)
                newHead = next;
            current.next = next.next;
            next.next = current;
            current = current.next;
            if(prev != null)
                prev.next = next;
            prev = next.next;
        }

        if(newHead == null)
            return head;
        return newHead;
    }

}
