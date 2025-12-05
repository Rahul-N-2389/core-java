package dailyproblems.Instances;

public class Book {
	static String LibraryName;
	String title;
	String author;
	void displayInfo() {
		System.out.println("library name :"+LibraryName);
		System.out.println("book title :"+title);
		System.out.println("Book author :"+author);
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		
		LibraryName="City Public Library";
		Book sem= new Book();
		sem.title="The Great Gatsby";
		sem.author="F Scott Fitzgerrald";
		sem.displayInfo();
		
		Book sem2=new Book();
		sem2.title="1984";
		sem2.author="George Orwell";	
		sem2.displayInfo();
	}

}
