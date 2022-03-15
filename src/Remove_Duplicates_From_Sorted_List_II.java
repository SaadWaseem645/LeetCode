import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicates_From_Sorted_List_II {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> unique = new ArrayList<>();
        ListNode current = head;
        int prevVal = -101;
        while(current != null) {
            if (prevVal != current.val) {
                prevVal = current.val;
                unique.add(current.val);
            } else if (unique.contains(current.val))
                unique.remove((Object) current.val);
            current = current.next;
        }

        ListNode prev = null;
        current = head;
        if(unique.size() == 0)
            return null;

        while(current != null){
            if(unique.contains(current.val))
                if(prev == null){
                    prev = current;
                    head = prev;
                }else{
                    prev.next = current;
                    prev = current;
                }
            current = current.next;
        }

        if(prev != null)
            prev.next = null;

        return head;

    }


}
