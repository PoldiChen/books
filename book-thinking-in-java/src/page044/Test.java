package page044;

public class Test {
	
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1 == i2); // false，两个对象，地址不同
		System.out.println(i1.equals(i2)); // true，值相同
	}

}
