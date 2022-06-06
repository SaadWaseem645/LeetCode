public class Intersection_Of_Two_Linked_List {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
      }
  }
    public ListNode getIntersectionNode_2(ListNode headA, ListNode headB) {

        ListNode currentA = headA, currentB = headB, intersectVal = null;

        while(currentA != null){
            currentA.val *= -1;
            currentA = currentA.next;
        }

        while(currentB != null){
            if(currentB.val < 0) {
                intersectVal = currentB;
                break;
            }
            currentB = currentB.next;
        }

        currentA = headA;

        while (currentA != null) {
            currentA.val *= -1;
            currentA = currentA.next;
        }

        return intersectVal;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currentA = headA, currentB = headB;
        int lengthA = 0, lengthB = 0;

        while(currentA != null){
            lengthA++;
            currentA = currentA.next;
        }

        while(currentB != null){
            lengthB++;
            currentB = currentB.next;
        }

        while(lengthA > lengthB){
            lengthA--;
            headA = headA.next;
        }

        while(lengthB > lengthA){
            lengthB--;
            headB = headB.next;
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }



}
