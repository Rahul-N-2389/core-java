package elc_blc;

public class Car {
	int carId;
	String brand;
	String model;
	int rentalPricePerDay;
	
public int getCarId () {
		return carId;
	}
public String getBrand() {
	return brand;
}
public String getModel() {
	return model;
}
public int getRentalPricePerDay() {
	return rentalPricePerDay;
}
public void setCarId( int id) {
	carId=id;
}
public void setBrand( String name) {
	brand=name;
}
public void setModel( String mode) {
	model=mode;
}
public void setRentalPricePerDay(int price) {
	rentalPricePerDay=price;
}

}
