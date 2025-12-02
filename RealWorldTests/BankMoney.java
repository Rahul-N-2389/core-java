package RealWorldTests;
import java.util.Scanner;
public class BankMoney {
	public void getMoney(int Amount,int PIN) {
		int balance=100000;
		int MPIN=2211;
		if (Amount >= balance && Amount0 && PIN==MPIN) {
			
			System.out.print("amount credited successfully...");
		}else if (Amount > balance) {
			System.out.print("Not enough Money");
		}else {
			System.out.print("Enter details wrong");
		}
	}
	public void getMultiof100() {
		System.out.println("Amount should be in multiples of 100");
	}
	
public static void main (String []args) {
	BankMoney obj= new BankMoney();
	
	java.util.Scanner Give= new Scanner(System.in);
	
	
	System.out.print("Enter amount : ");
	int Amount = Give.nextInt();
	if (Amount%100==0 ) {
		System.out.print("Enter Your PIN : ");
	
		int PIN=Give.nextInt();
		obj.getMoney(Amount,PIN);
		}else {
			obj.getMultiof100();
		}
		
	}else {
		System.out.println();
		
	}
	
	Give.close();
	}
}