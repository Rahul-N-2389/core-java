package creative_work;

public class TriangleStar {
	public String getTriangle() {
		String st=" ";
		for (int i=0;i<=10;i++) {
			st="*"+"  " +st;
			System.out.println(st);
		}return st;
		
	}

	public static void main(String[] args) {
		TriangleStar obj = new TriangleStar();
		obj.getTriangle();
		

	}

}
