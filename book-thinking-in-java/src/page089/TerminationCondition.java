package page089;

public class TerminationCondition {
	
	public static void main(String[] args) {
		Book book = new Book(true);
		System.gc();
	}
	
}

class Book {
	private boolean checkedOut = false;;
	
	public Book(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	public void checkIn() {
		this.checkedOut = false;
	}
	
	protected void finalize() {
		System.out.println("call finalize");
		if (this.checkedOut) {
			System.out.println("error: checked out");
		}
	}
}
