package abstraction;

public abstract class Bank {
	
	//partial abstraction
	
	// abstraction means hiding the implementation logic

	public abstract void loan(); // abstract method does not have any method body

	public void credit() {

		System.out.println("bank -- credit");
	}

	public void debit() {

		System.out.println("bank -- debit");
	}

}
