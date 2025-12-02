package conditionalStatements;


public class CheckMarks {
	public void numChecking(int marks) {
		if (marks>35 && marks<=75) {
			System.out.println("Pass");
		} if (marks>75 && marks<=100) {
			System.out.println("Distinction");
		}
	}
	public static void main(String[] args) {
		CheckMarks obj = new CheckMarks();
		obj.numChecking(85);
	}

}
