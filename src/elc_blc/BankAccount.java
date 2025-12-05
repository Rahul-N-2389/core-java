package elc_blc;

public class BankAccount {

	long accountNumber;
	String accountHolderName;
	int balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long number) {
		accountNumber=number;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String name) {
		accountHolderName=name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int bal) {
		balance=bal;
	}
}
