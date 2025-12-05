package elseIf_Condition;

public class Example2 {
	public boolean isEven(int num) {
		
		if(num%2==0) {
			return true;
		}
			else {
				return false;
			}
	}

	public static void main(String[] args) {
		Example2 obj=new Example2();
		boolean result=obj.isEven(55);
				if (result) {
					System.out.println("even number");
				}
				else {
					System.out.println("odd number");
				}

	}

}
