package Condition__If;

class CheckPosNegZero {
	public void posNegZero(int num){
	
	if (num>0){
	System.out.println("Given Nuumber is Positive Number");
	}
	
	if(num<0){
	System.out.println("Given Number is Negative Number");
	}

	if(num==0){
	System.out.println("Given Number is Zero");
	}
    }
public static void main (String[] args){
new CheckPosNegZero().posNegZero(0);
}
}
