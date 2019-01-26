package page230;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		for (int i=0; i<10; i++) {
			stack.add(i);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop()); // 9.8.7.6.5.4.3.2.1.0  和插入的顺序相反
		}
	}

}
