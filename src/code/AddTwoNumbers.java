package code;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午9:00:36
 * @Index 2
 * @Description:You are given two linked lists representing two non-negative
 *                  numbers. The digits are stored in reverse order and each of
 *                  their nodes contain a single digit. Add the two numbers and
 *                  return it as a linked list.
 * 
 *                  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int modSize = 10;
		ListNode head = new ListNode(0);
		ListNode ptr = head;
		boolean isOverFlow = false;
		
		while (l1 != null && l2 != null) {
			int sumVal = (l1.val + l2.val + (isOverFlow ? 1 : 0)) % modSize;
			isOverFlow = (l1.val + l2.val + (isOverFlow ? 1 : 0)) >= modSize;
			ptr.next = new ListNode(sumVal);
			ptr = ptr.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		ListNode lLeft = l1 != null ? l1 : l2;
		if (lLeft != null) {
			if (isOverFlow) {
				while(isOverFlow && lLeft != null)
				{
					int sumVal = (lLeft.val + 1) % modSize;
					isOverFlow = (lLeft.val + 1) >= modSize;
					ptr.next = new ListNode(sumVal);
					ptr = ptr.next;
					lLeft = lLeft.next;
				}
				if(lLeft != null)
				{
					ptr.next = lLeft;
				}
			} else {
				ptr.next = lLeft;
			}
		}

		if (isOverFlow) {
			ptr.next = new ListNode(1);
			isOverFlow = false;
		}

		return head.next;
	}
}
