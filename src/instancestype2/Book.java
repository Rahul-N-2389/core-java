package instancestype2;

public class Book {
	String bookTitle;
	String author;
	double isbn;
	public void addBookDetails(String bookTittle,String author,double isbn) {
		bookTitle=bookTitle;
		author=author;
		isbn=isbn;
		
	}
            public String displayDetails(){
           return "name of the book :"+bookTitle +"Will jacks :"+ author +" Isbn code :"+isbn;
}
    
	public static void main(String[] args) {
	Book Book=new Book();
	Book.bookTitle="can we be strangers again";
	Book.author="will jacks";
	Book.isbn=243.098;
     
      String R1=Book.displayDetails();
System.out.println(R1);

	}

}
