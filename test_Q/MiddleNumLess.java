package test_Q;



public class MiddleNumLess {
	public void getMidleNum() {
		int num=84719;
		if (num!=0) {
			int rem=num/10;
			System.out.println(rem);
			
			/*if(rem!=0) {
				int rem2=rem%100;
				System.out.println(rem2);
				*/
			int out=0;
			for(int i=1;i<rem;i++) {
			int rem2=rem%10;
				out=out*10+rem2;
				rem=rem/10; 
			}
			System.out.println(out);//1748
			int out2=0;
			while(out!=0) {
				int rem3=out%10;
				out2=out2*10+rem3;
				out=out/10;
			}System.out.println(out2);
			
			}
			
		}
	
	public static void main(String[] args) {
		MiddleNumLess obj =new MiddleNumLess();
		obj.getMidleNum();		

	}

}
