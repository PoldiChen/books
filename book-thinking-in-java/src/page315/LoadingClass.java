package page315;

public class LoadingClass {
	
	public static void main(String[] args) {
		System.out.println("main");
		new Candy();
		System.out.println("after load Candy");
		try {
			Class.forName("Cookie");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("after load Cookie");
	}

}

class Candy {
	static {
		System.out.println("loading Candy");
	}
}

class Cookie {
	static {
		System.out.println("loading cookie");
	}
}
