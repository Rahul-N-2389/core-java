package conditionalStatements;

public class Example5 {
	public boolean isDivisibleBy5(int num) {
		if(num%5==0) {
			return true;
		}
		if (!(num%5==0)) {
			return false;
		}
			return false;
		}
	

	public static void main(String[] args) {
		Example5 obj=new Example5();
		System.out.println("Is 15 divisible by 5? " + obj.isDivisibleBy5(55));

	}

}
