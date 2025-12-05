package AllVariablesAssignment;

public class Problem1 {
     static int a=20;
     static int b=30;
     
      static int sum() {
    	 System.out.println(a+b);
     return a+b;
      }
      static void average() {
    	  int r1=sum();
    	  System.out.println(r1/2);
      }
	public static void main(String[] args) {
	average();

	}

}
