package conditionalStatements;


public class CheckEvenOdd {
	public void numChecking(int num) {
		if (num%2==0) {
			System.out.println(num +" is an Even Number");
		}else if (num%2==1) {
			System.out.println(num +" is an Odd Number");
		}
	}
	public static void main(String[] args) {
		CheckEvenOdd obj = new CheckEvenOdd();
		obj.numChecking(2021);
	}

}
