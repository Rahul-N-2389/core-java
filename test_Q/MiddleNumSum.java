package test_Q;



public class MiddleNumSum {
	public String getMidleNum() {
		//one end seperate = 7
		int num=75547;
		int out1=0;
		if(num!=0) {
			int rem=num%10;
			out1=out1*10+rem;
			num= num/10;//7554	
			
		}
		
		  // reverse 7554 to 4557
			int out2=0;
			while(num!=0) {
				int rem2=num%10;
				out2=out2*10+rem2;
				num=num/10;
			}
			// another end  = 7
			int num2=out2;
			int out3=0;
			if(num2!=0) {
				int rem3=num2%10;
				out3=out3*10+rem3;
				num2= num2/10;  
			}
		
		//	sum middle numbers 5+5+4
		int num3=num2;
		int Store=0;
		while(num3!=0) {
			int rem4=num3%10;
			Store=Store+rem4;
			num3=num3/10;
		}
			int one=out1+out3;
		
		return (one==Store)? "both sums are equal":"both are not equal";
		
	}
	

	public static void main(String[] args) {
		MiddleNumSum obj =new MiddleNumSum();
		System.out.println(obj.getMidleNum());		

	}

}
