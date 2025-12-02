package conditionalStatements;


public class CheckEligible {
	public void numChecking(int age) {
		if (age>=18) {
			System.out.println(" Eligible for voting");
		}else {
			System.out.println(" Not Eligible for voting");
		}
	}
	public static void main(String[] args) {
		CheckEligible obj = new CheckEligible();
		obj.numChecking(17);
	}

}
