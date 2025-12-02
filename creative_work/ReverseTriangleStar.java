package creative_work;

public class ReverseTriangleStar {
	public String getTriangle() {
		int n=6;
		String st=" ";
		for(int j=n;j>=0;j--) {
		
		for (int i=0;i<=j;i++) {
			st="*";
			System.out.print(st);
		}
		System.out.println();
		
		}
		return st;
	}

	public static void main(String[] args) {
		ReverseTriangleStar obj = new ReverseTriangleStar();
		obj.getTriangle();
		

	}

}
