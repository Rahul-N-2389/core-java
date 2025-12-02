package elc_blc;

public class Product {
	
		 
		   int productId;
		     String productname;
		double price;
		int quantity;
		  	public int getProductId(){
		   return productId;
		}
		 	public void setProductId(int id){
			productId=id;
			System.out.println(productId);
			}
		public String getProductName(){
			return productname;
			}
		public void setProductName(String name){
		productname=name;
		}

		public double getPrice(){
			return price;
		}
			public void setPrice(double rate){
			price=rate;
			}
			public int getQuantity() {
			return quantity;
		}
			public void setQuantity(int count){
			quantity=count;
			}
				

}
