package dailyproblems;

public class Test4 {
      static int principal=100000;
      static int rate = 5;
      static int time=2;
      public static double calculateintrest(int principal,int rate,int time) {
    	  double SI=(principal*rate*time)/100;
    	  return SI;
      }
	public static void main(String[] args) {
	    System.out.println(calculateintrest(principal,rate,time));

	}

}
