public class Middle_Of_Linked_List {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public ListNode middleNode(ListNode head) {
        ListNode mid = head, current = head;
        int i = 1, j = 1;
        while(current != null){
            if(i/2 >= j){
                mid = mid.next;
                j++;
            }
            current = current.next;
            i++;
        }
        return mid;

    }
}
