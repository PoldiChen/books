package page452;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
	
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(10, "chen");
		students[1] = new Student(11, "wang");
		students[2] = new Student(9, "zhang");
		Arrays.sort(students, new Comparator<Student>() { // 传入Comparator参数
			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.getAge() - arg1.getAge();
			}
		});
		for (Student student : students) {
			System.out.println(student);
		}
	}
}

class Student{
	private int age;
	private String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "[student name=" + name + ",age=" + age + "]";
	}
}
