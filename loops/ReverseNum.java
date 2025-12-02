package loops;

public class ReverseNum {
	public void getNum() {
		int num=12345678;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
				rev=rev*10+rem;
				num /= 10;	
		}
		System.out.println(rev);
	}
	
	public static void main (String[]args) {
		new ReverseNum().getNum();
	}

}
