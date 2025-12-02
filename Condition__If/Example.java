package Condition__If;

public class Example {
	public void checkEvenOdd() {
		int i=1;
		for (i=0;i<200;i++) {
			if(i%2==0) {
			System.out.println("EvenNumbers"+i);
			}else{
				System.out.println("Odd Numbers"+i);
			}
		}
	}

	public static void main(String[] args) {
		Example obj=new Example();
		obj.checkEvenOdd();

	}

}
