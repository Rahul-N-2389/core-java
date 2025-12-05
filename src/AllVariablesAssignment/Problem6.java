package AllVariablesAssignment;

public class Problem6 {
	
	static int marks1=78;
	static int marks2=85;
	static int marks3=90;
	static double total() {
		double t1=marks1+marks2+marks3;
		
		return t1;
		
	}
	static void percentage() {
		
		System.out.println("percentage :"+(total()/300)*100);
		
	}

	public static void main(String[] args) {
		
	percentage();
	}

}
