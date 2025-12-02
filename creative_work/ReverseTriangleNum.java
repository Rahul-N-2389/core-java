package creative_work;

public class ReverseTriangleNum {
	public String getTriangle() {
		int n=6;
		String st="";
		for(int j=n;j>=0;j--) {
		for (int i=1;i<=j;i++) {
			st=i+" ";
			System.out.print(st);
		}System.out.println();
	}return st;
	
}

	public static void main(String[] args) {
		ReverseTriangleNum obj = new ReverseTriangleNum();
		obj.getTriangle();
		

	}

}
