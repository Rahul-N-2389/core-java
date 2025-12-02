package instancestype2;

public class StringDemo {

	String Name="Robin hood";
	String getStringValue() {
		return Name;
	}
	

	public static void main(String[] args) {
		StringDemo obj=new StringDemo();
		String result=obj.getStringValue();
		System.out.println(result);
		
		

	}

}

