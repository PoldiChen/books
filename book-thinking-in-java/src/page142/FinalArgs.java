package page142;

public class FinalArgs {
	
	public static void test1(final int a) {
//		a = 100; // 不能更改参数引用指向的对象
	}
	
	public static void test2(final A a) {
//		a = new A(); // 不能更改参数引用指向的对象
	}

}

class A {}
