package conditionalStatements;


public class CheckNum {
	public void numChecking(int number) {
		if (number==0) {
			System.out.println("Zero");
		}else if (number>0) {
			System.out.println("Positive Number");
		}else if (number<0) {
			System.out.println("Negative Number");
		}
	}
	public static void main(String[] args) {
		CheckNum obj = new CheckNum();
		obj.numChecking(-99);
	}

}
