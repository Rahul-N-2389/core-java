package AllVariablesAssignment;

public class Problem2 {
	static int radius=5;
	
	static  double area() {
		double ar= 3.14*radius*radius;
		System.out.println("area :"+ar);
		return ar;
	}
	static double perimeter() {
		double per= 2*3.14*radius;
		System.out.println("Perimeter:"+per);
		return per;
	}

	public static void main(String[] args) {
		area();
		perimeter();
		
		

	}

}
