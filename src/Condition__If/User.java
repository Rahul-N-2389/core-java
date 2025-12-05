package Condition__If;

		public class User {
			
			public void  checkUserName(String Username){
				
			if (Username=="Admin"){
			System.out.println(" Access Granted");
			  }
			}
		public static void main (String[] args){
		new  User().checkUserName("Admin");
		}
		}
