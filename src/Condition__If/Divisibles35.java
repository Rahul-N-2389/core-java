package Condition__If;

 public class Divisibles35 {
	public void  checkDivisibleNum(int num){
	
	
	if (num%3==0){
	System.out.println("Divisible by 3");
	}
	
	if(num%5==0){
	System.out.println("Divisible by 5");
	}

	if(num%5==0 && num%3==0){
	System.out.println("Divisible by 5 and 3");
	}

    }
public static void main (String[] args){
new  Divisibles35().checkDivisibleNum(9000);
}
}
