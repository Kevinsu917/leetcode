package test;

import org.junit.Test;

import code.AddTwoNumbers;
import code.ListNode;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午9:30:08
 * @Description: 
 */
public class AddTwoNumbersTest {

	@Test
	public void testaddTwoNumbers() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode resultNode = addTwoNumbers.addTwoNumbers(l1, l2);
		while(resultNode != null)
		{
			int val = resultNode.val;
			
			System.out.print(val);
			resultNode = resultNode.next;
			if(resultNode != null)
			{
				System.out.print("->");
			}
		}
		
	}
}
