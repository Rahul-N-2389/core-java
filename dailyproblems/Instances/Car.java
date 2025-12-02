package dailyproblems.Instances;

public class Car {
	static String showRoomName;
	String modelName;
	int Price;
	  void displayDetails() {
		System.out.println("show Room name:" + showRoomName);
		System.out.println("model name:" + modelName);
		System.out.println(Price);
		System.out.println("------------------");
		
	}
	public static void main(String[] args) {
		
		showRoomName="Elite motors";
			
		Car obj1=new Car();
		obj1.modelName="BMW X5";
		obj1.Price=80000;
		Car obj2=new Car();
		obj2.modelName="tesla Model S";
		obj2.Price=75000;
		obj1.displayDetails();
		obj2.displayDetails();
		
			
	
	} 

}
