package page236;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i=0; i<10; i++) {
			queue.offer(i);
		}
		while (queue.peek() != null) { // 也可以用 !empty(queue) 来控制循环
			System.out.println(queue.peek()); // 0,1,2,3,4,5,6,7,8,9 先进先出
			queue.remove();
		}
	}

}
