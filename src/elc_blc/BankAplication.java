package elc_blc;

public class BankAplication {

	public static void main(String[] args) {
		BankAccount Bank=new BankAccount();
		Bank.accountHolderName="Robin Hood";
		Bank.accountNumber=1234567890l;
		Bank.balance=50000;
		
		System.out.println("account Number : "+Bank.getAccountNumber());
		System.out.println("Account Holder Name : "+Bank.getAccountHolderName());
		System.out.println("Remaining Balance : "+Bank.getBalance());
		Bank.balance=10000;
		System.out.println("Remaining Balance : "+Bank.getBalance());
		

	}

}
