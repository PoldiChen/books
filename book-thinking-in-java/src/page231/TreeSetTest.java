package page231;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		Set<Integer> intSet = new TreeSet<Integer>();
		Random random = new Random(47);
		for (int i=0; i<10000; i++) {
			intSet.add(random.nextInt(30));
		}
		System.out.println(intSet); // [0, 1, 2, 3 ,,, 27, 28, 29]
	}

}
