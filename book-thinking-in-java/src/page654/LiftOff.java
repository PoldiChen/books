package page654;


public class LiftOff implements Runnable {
	
	protected int countDown = 10;
	private static int taskCount = 0; // 静态变量，即类变量，实例化多个对象的时候也是只有一个值，可以用来标识对象的个数，用作对象id
	private final int id = taskCount ++; // 线程的id，常量
	
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
