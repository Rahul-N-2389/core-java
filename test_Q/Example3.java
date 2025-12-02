package test_Q;

public class Example3 {
	
	public void getAdd() {
		
		int num=10;
		System.out.print(num +"! =");
		int fact=1;
		int i=1;
		while(i>=num) {
			fact=fact*i;
			
			System.out.print(i+"*");
			i++;
		}
		
		System.out.println(" = " +fact);
	}

	public static void main(String[] args) {
		Example3 obj =new Example3();
		obj.getAdd();
		
				

	}

}
