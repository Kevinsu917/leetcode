package code;

import java.util.Stack;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午7:38:49
 * @Description: Design a stack that supports push, pop, top, and retrieving the
 *               minimum element in constant time.
 * 
 *               push(x) -- Push element x onto stack. 
 *               pop() -- Removes the element on top of the stack. 
 *               top() -- Get the top element.
 *               getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {

	Stack<MinData> minStack = new Stack<MinData>();
	Stack<Integer> stack = new Stack<Integer>();
	int min;

	public void push(int x) {
		if (stack.isEmpty()) {
			minStack.push(new MinData(x, 1));
			min = x;
		} else {
			if (min >= x) {
				min = x;
				if (min == minStack.peek().resData) {
					minStack.peek().count++;
				} else {
					minStack.push(new MinData(min, 1));
				}
			}
		}
		stack.push(x);
	}

	public void pop() {
		if (stack.isEmpty()) {
			return;
		}

		int x = stack.pop();
		if (x == minStack.peek().resData) {
			if (minStack.peek().count > 1) {
				minStack.peek().count--;
			} else {
				minStack.pop();
				if (!minStack.isEmpty()) {
					min = minStack.peek().resData;
				} else {
					min = 0;
				}
			}
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}

	class MinData {

		public MinData(int resData, int count) {
			this.resData = resData;
			this.count = count;
		}

		int resData;
		int count;
	}
}
