package conditionalStatements;

public class Example3 {
	
	public boolean canVote(int age) {
		
		if(age>18) {
		return true;
		}
		if(age<18) {
			return false;
		}
		return false;
	}
	
	

	public static void main(String[] args) {
				Example3 obj=new Example3();
				System.out.println("Can vote Age 17?"+obj.canVote(17));
			
	}

}
