package page335;

import java.lang.reflect.Method;

public class ClassMethod {
	
	public static void main(String[] args) {
		try {
			Class<?> a = Class.forName("A");
			Method[] methods = a.getMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class A {
	private void func1() {}
	public void func2() {}
}
