package creative_work;

public class TriangleNum {
	public String getTriangle() {
		String st="";
		for (int i=1;i<=6;i++) {
			st=st + i+" ";
			System.out.println(st);
		}return st;
		
	}

	public static void main(String[] args) {
		TriangleNum obj = new TriangleNum();
		obj.getTriangle();
		

	}

}
