package page231;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<Integer>(); // Ĭ�ϰ���С��������
		Random random = new Random(47);
		for (int i=0; i<10000; i++) {
			intSet.add(random.nextInt(30)); // set�������ظ�������ֻ�ܷ���0-29��30������
		}
		System.out.println(intSet); // [0,1,2,3,4,,,28,29]
	}

}
