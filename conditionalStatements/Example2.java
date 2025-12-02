package conditionalStatements;

public class Example2 {
	public String checkNumber( int num) {
		if(num==0) {
		return "Zero";
		}
		if(num>0) {
		return "Positive";
				}
		if(num<0) {
		return "negative";
		}
		return "not valid number";
	}
	
	
	public static void main(String[] args) {
		
		Example2 emp=new Example2();
		System.out.println(emp.checkNumber(0));
		
	}

}
