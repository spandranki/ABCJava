package abcLearnJava;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading m = new MethodOverLoading();
		m.Sum();
		m.sum(5);
		m.sum(5, 7);
		
	}


	
	public void Sum() {
		System.out.println("Sum method");
	}
	
	public void sum(int i) {
		
		System.out.println("Sum method");
	}
	
	public void sum(int j, int k) {
		System.out.println("Sum method");
	}
}

