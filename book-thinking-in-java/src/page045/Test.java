package page045;

public class Test {
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.a = 100;
		a2.a = 100;
		System.out.println(a1.equals(a2)); // û����дequals���Ƚϵ������ã������ == �ıȽ�һ������false��Java�������ⶼ��д��equals
		System.out.println(a1 == a2);
	}

}

class A {
	int a;
}
