package instancestype2;

public class Movie {
    String name;
    int age;
    public void displayInfo(String name,int age) {
    	System.out.println(name);
    	System.out.println(age);
    }
	public static void main(String[] args) {
		Movie Employee=new Movie();
		Employee.displayInfo("robin",24);
		
	}

}
