package AllVariablesAssignment;

public class Problem3 {
	static int sub1=85;
	static int sub2=90;
	static int sub3=80;
	static void totalMarks() {
		System.out.println("total marks:"+(sub1+sub2+sub3));
	}
	static int averagesMarks() {
		int avg=(sub1+sub2+sub3)/3;
		return avg;
	}
	
public static void main (String[]args) {
	totalMarks();
	System.out.println("average :"+averagesMarks());
}
}
