package abcLearnJava;

public class StaticandNonStatic {

	String Name = "Sam";
	static int age = 26;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticandNonStatic sns = new StaticandNonStatic();

		System.out.println(StaticandNonStatic.age);
		System.out.println(age);
		System.out.println(sns.Name);
		method2();

		sns.method1();

	}

	public void method1() {
		System.out.println("this is method1 which is not static");
	}

	public static void method2() {

		System.out.println("this is method2 which is static");
	}

}
