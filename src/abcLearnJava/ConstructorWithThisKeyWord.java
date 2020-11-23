package abcLearnJava;

public class ConstructorWithThisKeyWord {

		//gloabl or class variables
		
		String name;
		int age;
			
	public ConstructorWithThisKeyWord(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorWithThisKeyWord obj = new ConstructorWithThisKeyWord("Sam", 26);

	}

}
