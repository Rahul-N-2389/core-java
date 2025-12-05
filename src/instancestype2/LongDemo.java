package instancestype2;

public class LongDemo {

	long l=1000000;
	long getLongValue() {
		return l;
	}
	

	public static void main(String[] args) {
		LongDemo obj=new LongDemo();
		long result=obj.getLongValue();
		System.out.println(result);
		
		

	}

}
