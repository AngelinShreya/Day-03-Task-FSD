package basic.code.java;

class Addition{
	// Overloading Concept
	static int sum(int a, int b) {
		return a + b;
	}
	static double divide(double a,double b) {
		if(b==0) {
			System.out.println("Cannot divided by Zero");
			//It’s used to represent the result of undefined or unrepresentable operations in floating-point arithmetic.
			return Double.NaN;
		}
		return a / b;
	}
}

public class OverLoading {

	public static void main(String[] args) {
		System.out.println("\t---Overloading Function---");
		//Addition ad = new Addition();
		int iresult = Addition.sum(2, 5);
		double dresult = Addition.divide(4, 0);
		System.out.println("\nInteger Parameter Result:"+iresult);
		System.out.println("Double Parameter Result:"+dresult);
	}
}
