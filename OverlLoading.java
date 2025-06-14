package basic.code.java;

class Addition{
	//Overloading 
	static int sum(int a,int b) {
		return a+b;
	}
	static double sum(double a,double b) {
		return a+b;
		
	}
}

public class OverlLoading {

	public static void main(String[] args) {
		System.out.println("\t---Overloading Funcction---");
		Addition ad = new Addition();
		int iresult = ad.sum(2, 5);
		double dresult = ad.sum(4, 5);
		System.out.println("\nInteger Parameter Result:"+iresult);
		System.out.println("Double Parameter Result:"+dresult);
	
		

	}
	

}
