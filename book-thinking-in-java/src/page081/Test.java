package page081;

public class Test {
	
	public static void main(String[] args) {
		long l = 100;
		int i = 100;
		test1((int) l); // ��ǿ��ת���Ļ��޷�����ͨ��
		test2(i); // ���Ա���ͨ����int�Զ�����Ϊlong
	}
	
	public static void test1(int i) {}
	
	public static void test2(long l) {}

}
