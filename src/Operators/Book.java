package Operators;

public class Book {
	String title;
	String author;

	 
	public void addBook(){
		System.out.println("Book Added:" +title +":The complete reference by" +author);
		
	}
	
	

	public static void main(String[] args) {
		Book Book1= new Book();
		Book1.title="java";
		Book1.author="Herbert Schildt";
		Book1.addBook();
	
	}

}
