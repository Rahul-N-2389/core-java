package loops;

public class Neon {
	public boolean getNeon(int num) {
		int sqare=num*num;
		
		int back=num;
		int rev=0;
		while(sqare!=0) {
			
			int rem=sqare%10;
			rev=rev+rem;
			sqare /=10;
		}
		return back==rev;
	}

	public static void main(String[] args) {
		boolean result=new Neon().getNeon(9);
		System.out.println(result?" is Neon number":"not Neon");
		

	}

}
