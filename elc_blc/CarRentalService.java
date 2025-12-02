package elc_blc;

public class CarRentalService {

	public static void main(String[] args) {
		Car obj1=new Car();
		Car obj2=new Car();
		
		obj1.setBrand("tesla");
		obj1.setCarId(9999);
		obj1.setModel("XUV 55");
		obj1.setRentalPricePerDay(10000);
		
		System.out.println("Car Id :"+obj1.getCarId());
		System.out.println("Car Brand : "+obj1.getBrand());
		System.out.println("Car Model : "+obj1.getModel());
		System.out.println("ar Rental Price : "+obj1.getRentalPricePerDay());
		

	}

}
