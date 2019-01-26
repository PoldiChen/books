package page654;

public class LiftOffSleep implements Runnable {
	
	protected int countDown = 10;
	private static int taskCount = 0; // 静态变量，即类变量，实例化多个对象的时候也是只有一个值，可以用来标识对象的个数，用作对象id
	private final int id = taskCount ++; // 线程的id，常量
	
	public LiftOffSleep() {}
	
	public LiftOffSleep(int countDown) {
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
			try { // 必须在线程内处理异常，不会返回给main函数
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}
	}


}
