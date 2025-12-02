package dailyproblems;

public class Test3 {
	static int sub1= 85;
	static int sub2= 90;
	static int sub3= 80;
	public static void totalmarks(int sub1,int sub2,int sub3) {
		System.out.println(sub1+sub2+sub3);
	}
	public static int average(int sub1,int sub2,int sub3) {
		int avg =(sub1+sub2+sub3)/3;
		return avg;
	}
  
	public static void main(String[] args) {
		totalmarks(10,20,30);
		average(30,40,50);
		System.out.println(average(30,40,50));


	}

}
