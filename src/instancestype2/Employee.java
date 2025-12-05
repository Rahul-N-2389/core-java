package instancestype2;

public class Employee {
	
	  
		   String title="java";
		   int likes;
		      void likes(){
		       likes++;
		      }
		      void displayLikes(){
		       System.out.println(title);
		       System.out.println(likes);
		      }
		public static void main (String[]args) {
		    Employee Movie=new Employee();
		    Movie.likes();
		    Movie.displayLikes();
		  }
		 }
