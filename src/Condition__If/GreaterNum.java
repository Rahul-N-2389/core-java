package Condition__If;

class GreaterNum {
	public void checkGreaterNum(int num1, int num2){
	
	if (num1>num2){
	System.out.println("num1 is Greater ");
	}
	
	if(num2>num1){
	System.out.println("Num2 is Greater");
	}

    }
public static void main (String[] args){
new  GreaterNum().checkGreaterNum(100,500);
}
}