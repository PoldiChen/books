package page654;


public class LiftOff implements Runnable {
	
	protected int countDown = 10;
	private static int taskCount = 0; // ��̬���������������ʵ������������ʱ��Ҳ��ֻ��һ��ֵ������������ʶ����ĸ�������������id
	private final int id = taskCount ++; // �̵߳�id������
	
	public LiftOff() {}
	
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String getStatus() {
		if (countDown > 0) {
			return "id="+id+", countDown="+countDown;
		} else {
			return "id="+id+", liftoff!";
		}
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(getStatus());
			Thread.yield();
		}
	}

}
