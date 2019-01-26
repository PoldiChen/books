package page077;

public class Test {
	
	public static void main(String[] args) {
		Tree tree = new Tree(100); // 不能调用默认的无参的构造函数，自定义了构造函数后，编译器不会自动创建默认的构造函数
		System.out.println(tree);
	}
}

class Tree {
	public Tree(int height) {}
}
