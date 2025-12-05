package elc_blc;

public class OutputOfProduct {

	public static void main(String[] args) {
		Product obj1=new Product();
		Product obj2=new Product();
		
		obj1.productId=4200;
		obj1.productname="one plus";
		obj1.price=25000;
		obj1.quantity=20;
		

  obj2.setQuantity(25);
  System.out.println("Product Id :"+obj1.getProductId());
  System.out.println("Product Name :"+obj1.getProductName());
  System.out.println("Product Price :"+obj1.getPrice());
  System.out.println("Product Quantity :"+obj2.getQuantity());
	}

}
