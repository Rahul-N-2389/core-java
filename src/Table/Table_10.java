package Table;

public class Table_10 {
	int a;
	int b;
	public int multiTable() {
		b=b+1;
		
		System.out.println(a +" X " +(b) +" =  " +(a*b));
		return a*b;
		
	}

public static void main (String[] args) {
	Table_10 obj1=new Table_10();
	
	obj1.a=100;
	obj1.b=0;
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	obj1.multiTable();
	}
}