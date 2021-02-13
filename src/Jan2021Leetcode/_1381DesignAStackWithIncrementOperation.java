package Jan2021Leetcode;

import java.util.Stack;

public class _1381DesignAStackWithIncrementOperation {
	public static void main(String[] args) {
		CustomStack customStack = new CustomStack(3); // Stack is Empty []
		customStack.push(1); // stack becomes [1]
		customStack.push(2); // stack becomes [1, 2]
		System.out.println(customStack.pop()); // return 2 --> Return top of the stack 2, stack becomes [1]
		customStack.push(2); // stack becomes [1, 2]
		customStack.push(3); // stack becomes [1, 2, 3]
		customStack.push(4); // stack still [1, 2, 3], Don't add another elements as size is 4
		customStack.increment(5, 100); // stack becomes [101, 102, 103]
		customStack.increment(2, 100); // stack becomes [201, 202, 103]
		System.out.println(customStack.pop()); // return 103 --> Return top of the stack 103, stack becomes [201, 202]
		System.out.println(customStack.pop()); // return 202 --> Return top of the stack 102, stack becomes [201]
		System.out.println(customStack.pop()); // return 201 --> Return top of the stack 101, stack becomes []
		System.out.println(customStack.pop()); // return -1 --> Stack is empty return -1.
	}

	static class CustomStack {
		Stack<Integer> stack;
		int size;

		public CustomStack(int maxSize) {
			stack = new Stack<Integer>();
			size = maxSize;
		}

		public void push(int x) {
			if (stack.size() < size)
				stack.push(x);
		}

		public int pop() {
			if (stack.isEmpty())
				return -1;
			return stack.pop();
		}

		public void increment(int k, int val) {

			Stack<Integer> temp = new Stack<Integer>();
			while (!stack.isEmpty()) {
				temp.push(stack.pop());
			}

			while (!temp.isEmpty()) {
				if (k > 0)
					stack.push(temp.pop() + val);
				else
					stack.push(temp.pop());
				k--;
			}
		}
	}

}
