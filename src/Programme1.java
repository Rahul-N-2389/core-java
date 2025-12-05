
class Sunil{
	static void demo() {
		System.out.println("demo");
	}
	String demo2() {
		return "instance method";
	}
}
public class Programme1 {


	public static int add(int num1,int num2) {
		return num1+num2;
	}
		
	 public static int sub(int num1,int num2) {
		return num1-num2;
	 }
		public static int mul(int num1,int num2) {
			return num1*num2 ;
		}
			public static int div(int num1,int num2) {
				return num1/num2 ;
	}
	
	 public static void main(String [] args) {
		 int result1 = Programme1.add(10,10);
		 System.out.println(result1);
		     int result2 = sub(15,10);
		     System.out.println(result2);
		     int result3 = mul(20,20);
		     System.out.println(result3);
		     int result4 = div(50,5);
		     System.out.println(result4);
		     Sunil.demo();
		     Sunil obj=new Sunil();
		     obj.demo2();
		     
		     
		     
		     
		

}
}
