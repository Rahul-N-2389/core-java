package dailyproblems.Instances;

public class Mobile {
	static String storeName;
	String brand;
	int price;
	void showDetails() {
		System.out.println("Store Name :"+storeName);
		System.out.println("Mobile Brand :"+brand);
		System.out.println("mobile Price :"+price);
		System.out.println("--------------");
	}

	public static void main(String[] args) {
		storeName="Tech World";
		Mobile sub1= new Mobile();
		sub1.brand="apple";
		sub1.price=1200;
		
		Mobile sub2= new Mobile();
		sub2.brand="samsung";
		sub2.price=900;
		sub1.showDetails();
		sub2.showDetails();
		


	}

}
