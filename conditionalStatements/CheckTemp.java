package conditionalStatements;


public class CheckTemp {
	public void numChecking(int temperature) {
		if (temperature<0) {
			System.out.println("Cold");
		}else if (temperature>0 && temperature<=20) {
			System.out.println("Warm");
		}else if (temperature>20) {
			System.out.println("Hot");
		}
	}
	public static void main(String[] args) {
		CheckTemp obj = new CheckTemp();
		obj.numChecking(-10);
	}

}
