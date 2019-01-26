package page353;

public class GenericType {
	
	public static void main(String[] args) {
		Holder<Automobile> holder = new Holder<Automobile>(new Automobile());
		Automobile automobile = holder.getT(); // 不需要转型
		System.out.println(automobile);
	}
}

class Automobile {}

class Holder<T> {
	private T obj;
	
	public Holder(T t) {
		this.obj = t;
	}
	
	public void setT(T t) {
		this.obj = t;
	}
	
	public T getT() {
		return obj;
	}
}
