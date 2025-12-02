package dailyproblems.Instances;

public class Demoinstance {
	boolean b;
	int i;
	String st;
	public String getData(boolean b1,int i1,String st1) {
		b=b1;
		 i=i1;
		 st=st1;
		return "Successfully updated";
		
	}
public static void main(String[]args) {
	Demoinstance obj1=new Demoinstance();
	Demoinstance obj2=new Demoinstance();
	obj1.getData(true,34,"java");
	obj2.getData(false, 33, "python");
	System.out.println(obj1.st +" "+obj2.st);
	
	
}
}
