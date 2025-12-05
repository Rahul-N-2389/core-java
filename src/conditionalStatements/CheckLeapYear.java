package conditionalStatements;


public class CheckLeapYear {
	public void numChecking(int year) {
		if (year%4==0) {
			System.out.println(year +" Leap Year");
		}else {
			System.out.println(year +" Not Leap Year");
		}
	}
	public static void main(String[] args) {
		CheckLeapYear obj = new CheckLeapYear();
		obj.numChecking(2024);
	}

}
