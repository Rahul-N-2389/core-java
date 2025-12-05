package conditionalStatements;

public class Example4 {
	public int findGreater(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}
		if(num1<num2) {
			return num2;
		}
		return 0;
	}
	
	

	public static void main(String[] args) {
		Example4 obj=new Example4();
		System.out.println("Greater number (10, 25): " + obj.findGreater(10, 25));
		

	}

}
