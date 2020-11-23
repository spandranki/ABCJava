package abstraction;

public interface Car {
	
	//In interface all methods are/should be abstract in nature
	//only abstract methods - only method declaration - no method body
	//we achieve 100% abstraction
	//no implementation. to implement - create a class - implements keyword
	//Cannot create object of interface
	//Only final or static variables can only be defined
	
	public void start();
	public void stop();
	public void refuel();
	

}
