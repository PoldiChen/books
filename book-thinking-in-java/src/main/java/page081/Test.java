package page081;

public class Test {
	
	public static void main(String[] args) {
		long l = 100;
		int i = 100;
		test1((int) l); // 不强制转换的话无法编译通过
		test2(i); // 可以编译通过，int自动提升为long
	}
	
	public static void test1(int i) {}
	
	public static void test2(long l) {}

}
