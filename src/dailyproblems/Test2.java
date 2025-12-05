package dailyproblems;

public class Test2 {
	static int r=5;
	public static double area(int r ) {
		double a =3.14*r*r;
		System.out.println(a);
		return a;
	}
      public static double perimeter(int r ) {
    	  double p= 2*3.14*r;
    	  System.out.println(p);
    	  return p;
    	  
      }
	public static void main(String[] args) {
		area(r);
		perimeter(r);


	}

}
