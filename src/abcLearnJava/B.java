package abcLearnJava;

public class B extends A {

	public B() {

		super(10); 	// to call the parent class constructor  - constructor call must be the first statement in the constructor
		System.out.println("Child class constructor");

	}

	public static void main(String[] args) {

		B Obj = new B();		// parent class constructor will be called by default 

		// if we don't use super keyword, default constructor will called
	}

}
