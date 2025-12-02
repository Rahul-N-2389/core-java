package AllVariablesAssignment;

public class Problem9 {
	static double dollarRate=84.5;
	static double converToINR( double usd) {
		double INR=usd*dollarRate;
		return INR;
	
	}
	public static void main(String[] args) {
		System.out.println(converToINR(100));
		System.out.println(converToINR(200));
		System.out.println(converToINR(300));
	}

}
