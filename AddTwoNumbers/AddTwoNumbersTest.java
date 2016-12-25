package AddTwoNumbers;

public class AddTwoNumbersTest {
	public static void main(String[] argv) {
		AddTwoNumbers test = new AddTwoNumbers();
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		
		ListNode result = test.addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.print(result.val + "->");
			result = result.next;
		}
	}
}
