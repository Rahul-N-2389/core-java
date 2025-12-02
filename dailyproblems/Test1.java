package dailyproblems;

public class Test1 {
	static int a=20;
	 static int b=30;
	public static int sum() {
		System.out.println("sum:"+(a+b));
		return a+b;
		
	}
	public static int average() {
	
		int avg=sum()/2;
		
		return avg;
}

	public static void main(String[] args) {
	System.out.println("average:"+average());
		
		
	
}
}