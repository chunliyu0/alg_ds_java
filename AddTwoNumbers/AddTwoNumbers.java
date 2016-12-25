package AddTwoNumbers;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        boolean flag = false;
        while (l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {
                int result = flag ? l2.val + 1 : l2.val;
                flag = result >= 10 ? true : false;
                result = result >= 10 ? result - 10 : result;
                head.next = new ListNode(result);
                head = head.next;
                l2 = l2.next;
            }
            if (l1 != null && l2 == null) {
                int result = flag ? l1.val + 1 : l1.val;
                flag = result >= 10 ? true : false;
                result = result >= 10 ? result - 10 : result;
                head.next = new ListNode(result);
                head = head.next;
                l1 = l1.next;
            }
            if (l1 != null && l2 != null) {
                int result = flag ? l1.val + l2.val + 1 : l1.val + l2.val;
                flag = result >= 10 ? true : false;
                result = result >= 10 ? result - 10 : result;
                head.next = new ListNode(result);
                head = head.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if (flag == true) {
            head.next = new ListNode(1);
            flag = false;
        }
        return dummy.next;
    }
	
}
