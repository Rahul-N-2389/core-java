package AllVariablesAssignment;

public class Problem4 {
	static int principal=5000;
	static int rate=5;
	static int time=2;
	static double calculateIntrest() {
		double SI=principal*rate*time;
		System.out.println("Simple Intrest :"+ SI);
		return SI;
	}

	public static void main(String[] args) {
		
		calculateIntrest();
		

	}

}
