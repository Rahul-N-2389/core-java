package test_Q;

public class PrimeNumber {
	public void  getPrime() {
		int num=26;
		for (int i=2;i<num;i++) {
			boolean b=num%i==0;
		
			if(true) {
				System.out.println("is not prime");
			}else{
				System.out.println("is prime");break;
			}
		}
		}
	

	
	public static void main (String []args) {
		new PrimeNumber().getPrime();
		
	}
}
