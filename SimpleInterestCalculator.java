
public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
    	return (principal*rate*time)/100;
    	
    }
	public static void main(String[] args) {
		 double Result= calculateSimpleInterest(1000,3,365);
		 System.out.println(Result);
		
		
	}

}
