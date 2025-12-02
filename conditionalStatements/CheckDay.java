package conditionalStatements;


public class CheckDay {
	public void numChecking(int a, int b) {
		switch (a,b) {
		
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println("Tues day");
			break;
		case 3:
			System.out.println("Wedness day");
			break;
		case 4:
			System.out.println("Thurs day");
			break;
		case 5:
			System.out.println("Fri day");
			break;
		case 6:
			System.out.println("Sat day");
			break;
		case 7:
			System.out.println("Sun day");
			break;
		}
	}
	public static void main(String[] args) {
		CheckDay obj = new CheckDay();
		obj.numChecking(7);
	}

}
