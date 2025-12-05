package test_Q;

public class PrimeNumber2 {
	public void  getPrime() {
		
		    
		        int limit = 100;

		        System.out.println("Prime numbers up to " + limit + ":");

		        for (int num = 2; num <= limit; num++) {
		            boolean isPrime = true;

		            // check divisibility from 2 to num-1
		            for (int i = 2; i < num; i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            if (isPrime) {
		                System.out.print(num + " ");
		            }
		        }
		    
		}
	
	public static void main (String []args) {
		new PrimeNumber2().getPrime();
		
	}
}
