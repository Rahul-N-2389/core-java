package dailyproblems;

public class Test10 {
	static int rate=10;
	public static int calculateAmount(int amount) {
		int total=rate+amount;
		return total;
		
	}

	public static void main(String[] args) {
		int R10=calculateAmount(500);
		System.out.println(R10);
		

	}

}
