package abcLearnJava;

public class Variables {
	String s = "SamAruu";
	int g  = 10;
	
	public int sum() {
		int j=15;
		int k = j*g;
		return k;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables v = new Variables();		
		int mul = v.sum();
		System.out.println(mul);

	}

	

}
