package RealWorldTests;
import java.util.Scanner;
public class BankMoney2 {
	public void getMoney(int Amount,int PIN) {
		
		int balance=100000;
		int MPIN=2211;
		
		java.util.Scanner Give= new Scanner(System.in);
		
		System.out.print("Enter amount : ");
		 Amount = Give.nextInt();
		
		if (Amount >= balance) {
			
			System.out.print("not anough money");
		} else if (Amount<0) {
			System.out.println("invalid Enter Amount");
		
		
		}else if(Amount%100==1) {
			System.out.print("Enter details wrong");
			System.out.print("Enter Your PIN : ");
			 PIN=Give.nextInt();
		}else if (PIN!=MPIN) {
			System.out.print("enter Wrong PIN");
	}
	}
	
	 
public static void main (String []args) {
	BankMoney2 obj= new BankMoney2();
	obj.getMoney();
}
	}
	
	
	
	
	
	
		
		
	
		
	