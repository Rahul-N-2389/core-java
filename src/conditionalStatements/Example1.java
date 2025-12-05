package conditionalStatements;

public class Example1 {
	
	
	public boolean isEven( int a) {
		if(a % 2==0) { 
		return true;
		}
		if (a % 2==1) {
			return false;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Example1 obj = new Example1(); 
		 System.out.println("Is 10 even? " + obj.isEven(10));
		

	}

}
