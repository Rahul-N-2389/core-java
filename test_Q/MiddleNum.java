package test_Q;



public class MiddleNum {
	public void getMidleNum() {
		int num=56453;
		if (num!=0) {
			int rem=num/10;
			
			if(rem!=0) {
				int rem2=rem%100;
				System.out.println(rem2);
			}
		}
	}
	public static void main(String[] args) {
		MiddleNum obj =new MiddleNum();
		obj.getMidleNum();		

	}

}
