package instancestype2;

public class Car {
    String Carmake;
    String Carmodel;
   int  manufacturingyear;
public void addCarDetails( String Car, String model, int year) {
      
    Carmake=Car;
    Carmodel=model;
    manufacturingyear=year;
 }
public String displayDetails (){
System.out.println( "car brand :"+Carmake );
System.out.println(  "Car model :" + Carmodel );
System.out.println(  "Manufacturing Year :" + manufacturingyear );
return Carmake+Carmodel+manufacturingyear;
}
public static void main (String []args ){
Car Car= new Car();
Car.addCarDetails( "Toyota","XUV X5",2025);
 String hello=Car.displayDetails();
 System.out.println(hello);

}
}
  