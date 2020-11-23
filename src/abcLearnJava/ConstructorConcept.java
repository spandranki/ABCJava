package abcLearnJava;

public class ConstructorConcept {

	public ConstructorConcept() {
		
		System.out.println("Default constructor - bcz I'm not passing any parameters");
		
	}
	
	public ConstructorConcept(int i) {
		
		System.out.println("Single parameter constructor");
		System.out.println("the value of i is "+i);
	}
	
public ConstructorConcept(int i, int j) {
		
		System.out.println("two parameter constructor");
		System.out.println("the value of i is "+i);
		System.out.println("the value of j is "+j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept cc = new ConstructorConcept();	//default constructor will be called bcz we aren't passing anything over here
		ConstructorConcept cc1 = new ConstructorConcept(10);
		ConstructorConcept cc2 = new ConstructorConcept(10, 20);
	}

}
