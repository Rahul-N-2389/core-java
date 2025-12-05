package Operators;

public class Car {
	String brand;
	double Price;
}
	
	 class Showroom {
		
	public void displayCar(Car c) {
		System.out.println("Car Brand: "+c.brand);
		System.out.println("Car Price: "+c.Price);
	}

	public static void main(String[] args) {
		Car Car=new Car();
		Car.brand="Tesla";
		Car.Price=75000.5;
		
		
		Showroom obj=new Showroom();
		obj.displayCar(Car);
		

	}

}

