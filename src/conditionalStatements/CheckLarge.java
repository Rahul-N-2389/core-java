package conditionalStatements;


public class CheckLarge {
	public void numChecking(int a, int b, int c) {
		if (a>b && a<c) {
			System.out.println("a is big Number");
		}else if (b>a && b>c) {
			System.out.println("b is big Number");
		}else {
			System.out.println("c is big Number");
		}
	}
	public static void main(String[] args) {
		CheckLarge obj = new CheckLarge();
		obj.numChecking(10,6,3);
	}

}
