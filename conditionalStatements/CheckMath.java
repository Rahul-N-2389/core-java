package conditionalStatements;


public class CheckMath {
	public void numChecking(int Day) {
		switch (Day) {
		
		case 1:
			System.out.println("Mon day");
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
		CheckMath obj = new CheckMath();
		obj.numChecking(7);
	}

}
