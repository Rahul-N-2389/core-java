package Condition__If;

class AgeEligibility {
	public void checkEligibility(int age){
	
	if (age>18){
	System.out.println("Eligible to vote");
	}
	
	if(age<18 && age>0){
	System.out.println("Not Eligible for Vote");
	}
	if ( age<0) {
		System.out.println("Enter number is Wrong ");
		
	   }
    }
public static void main (String[] args){
new AgeEligibility().checkEligibility(15);
}
}