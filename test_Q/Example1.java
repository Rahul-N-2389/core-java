package test_Q;

public class Example1 {
	
	public void getAdd(int num) {
		
		int rev=0;
		while(num !=0) {
			int sum = num%10;
			rev=rev *10 +sum;
			num /= 10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Example1 obj =new Example1();
		obj.getAdd(23444);
		
				

	}

}
