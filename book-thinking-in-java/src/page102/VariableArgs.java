package page102;

public class VariableArgs {
	
	public static void main(String[] args) {
		print(100, 1.1);
		print("test");
	}
	
	public static void print(Object ... args) { // 可变参数
		for (Object object : args) {
			System.out.println(object);
		}
	}

}
