package test_Q;

public class Example2 {
	
	public void getAdd(int num) {
		
		int add=0;
		while(num !=0) {
			int sum = num%10;
			add=add+sum;
			num /= 10;
		}
		System.out.println(add);
	}

	public static void main(String[] args) {
		Example2 obj =new Example2();
		obj.getAdd(23444);
		
				

	}

}
