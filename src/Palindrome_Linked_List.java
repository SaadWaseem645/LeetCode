public class Palindrome_Linked_List {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        prev = slow;
        slow = slow.next;
        prev.next = null;

        while(slow != null){
           temp = slow.next;
           slow.next = prev;
           prev = slow;
           slow = temp;
        }

        fast = head;
        slow = prev;

        while(slow != null){
            if(slow.val != fast.val )
                return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;

    }

}
