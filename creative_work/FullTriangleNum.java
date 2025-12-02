package creative_work;

public class FullTriangleNum {
	public String getTriangle() {
		int n=6;
		String st="";
		for (int i=1;i<=n;i++) {
		for (int j=n-i;j>=0;j--) {
			st="";
			for(int k=i;k>=0;k--) {
				st=st+"*";
			System.out.print(st);
		}System.out.println();
		}
		}
		return st;
	}

	public static void main(String[] args) {
		FullTriangleNum obj = new FullTriangleNum();
		obj.getTriangle();
		

	}

}
