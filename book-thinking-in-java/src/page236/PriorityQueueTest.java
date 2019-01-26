package page236;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueTest {
	
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	public static void test2() {
		PriorityQueue<Student> queue = new PriorityQueue<Student>(); // 放入队列的类必须实现Comparable接口，否则抛ClassCastException，无法转换为Comparble类
		queue.offer(new Student(10, "chen"));
		queue.offer(new Student(8, "wang"));
		queue.offer(new Student(11, "zhang"));
		while (queue.peek() != null) {
			System.out.println(queue.peek());
			queue.remove();
		}
	}
	
	public static void test1() {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		Random random = new Random(47);
		for (int i=0; i<10; i++) {
			queue.offer(random.nextInt(30)); // 产生的随机数按从小到大排列
		}
		while (queue.peek() != null) {
			System.out.println(queue.peek());
			queue.remove();
		}
	}
}

class Teacher {}

class Student implements Comparable<Student> {
	private int age;
	private String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student arg0) {
		return this.age - arg0.age;
	}
	
	@Override
	public String toString() {
		return "[student age=" + this.age + ",name="+this.name + "]";
	}
}
