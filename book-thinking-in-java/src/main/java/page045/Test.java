package page045;

public class Test {
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.a = 100;
		a2.a = 100;
		System.out.println(a1.equals(a2)); // 没有重写equals，比较的是引用，结果和 == 的比较一样都是false；Java大多数类库都重写了equals
		System.out.println(a1 == a2);
	}

}

class A {
	int a;
}
