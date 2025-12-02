package Condition__If;

public class CheckOddEven {
	
	public void checkOddOrEven(int num) {
		if( num%2==0){
		System.out.println("Given number is Even Number");
	}
		if ( num%2==1){
		System.out.println("Given Number is Odd Number");
		}
	}
	public static void main(String[] args) {
		
		new CheckOddEven().checkOddOrEven(24);
		
	}

}
