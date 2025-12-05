package dailyproblems;

public class Test9 {
	static double dollarRate=84.5;
	public static double convertToINR(double usd) {
		double Rate= usd*dollarRate;
		return Rate;
	}

	public static void main(String[] args) {
		System.out.println(convertToINR(85));
		System.out.println(convertToINR(100));
		System.out.println(convertToINR(200));
	
	}

}
