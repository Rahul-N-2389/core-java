package elc_blc;

public class Library {

	public static void main(String[] args) {
		Book obj1=new Book();
		Book obj2=new Book();
		
		
		obj1.setBookId(1420);
		obj1.setTitle("java");
		obj1.setAuthor("james gosling");
		obj1.setPrice(599);
		
		System.out.println("book id :"+obj1.getBookId());
		System.out.println("bokk title :"+obj1.getTitle());
		System.out.println("book author :"+obj1.getAuthor());
		System.out.println("book Price :"+obj1.getPrice());
		

	}

}
