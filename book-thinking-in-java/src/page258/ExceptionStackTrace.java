package page258;

public class ExceptionStackTrace {
	
	public static void main(String[] args) {
		h();
		System.out.println("--------------------");
		g();
		System.out.println("--------------------");
		f();
	}
	
	static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}
	
	static void g() {
		f();
	}
	
	static void h() {
		g();
	}

}
