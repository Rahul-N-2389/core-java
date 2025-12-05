package creative_work;

public class ReverseTriangleNum2 {
	public String getTriangle() {
		int n=6;
		String st="";
		for(int j=n;j>=1;j--) {
		for (int i=j;i<=j;i++) {
			st=st + i+" ";
			System.out.println(st);
		}
		}return st;
		
	}

	public static void main(String[] args) {
		ReverseTriangleNum2 obj = new ReverseTriangleNum2();
		obj.getTriangle();
		

	}

}
