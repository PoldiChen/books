package page450;

import java.util.Arrays;

public class ArraysMethod {
	
	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 2;
		numbers[1] = 3;
		numbers[2] = 1;
		Arrays.sort(numbers);
		print(numbers);
		int index = Arrays.binarySearch(numbers, 2);
		System.out.println(index);
	}
	
	public static void print(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
