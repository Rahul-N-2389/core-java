package Condition__If;

		public class Amount {

			public void  checkAmount(int Money){
				
			if (Money>500){
			double Discount=Money-(Money*0.1);
			
			System.out.println("With Discount : "+Discount);
			  }
			if (Money<500) {
				System.out.println("No Discount  ");
			 }
			}
			
		public static void main (String[] args){
		new  Amount().checkAmount(3400);
		}
		}
