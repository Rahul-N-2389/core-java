package dailyproblems;

public class Test8 {
	static int num=5;
	public static int square() {
		int sq=num*num;
		return sq;
	}
	static void cube() {
		    int cu = square()*num;
		    System.out.println("cube of num:"+cu); 
		}
	public static void main(String[] args) {
		System.out.println("sqare of num:"+square());
		cube();
		
	
	}

}
