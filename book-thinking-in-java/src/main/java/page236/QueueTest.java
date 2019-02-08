package page236;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i=0; i<10; i++) {
			queue.offer(i);
		}
		while (queue.peek() != null) { // Ҳ������ !empty(queue) ������ѭ��
			System.out.println(queue.peek()); // 0,1,2,3,4,5,6,7,8,9 �Ƚ��ȳ�
			queue.remove();
		}
	}

}
