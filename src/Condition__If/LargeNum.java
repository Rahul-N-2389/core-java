package Condition__If;

public class LargeNum {
	
		public void  checkLargerNum(){
		
		int num1=55;
		int num2=43;
		int num3=121;
		
		if (num1>num2 ){
		if(num1>num3){
		System.out.println("num1 Larger");
		  }
		}
		if (num2>num1 ){
		if(num2>num3){
		System.out.println("num2 Larger");
		  }
		}
	    
		if (num3>num2 ){
		if(num3>num1){
		System.out.println("num3 Larger");
		  }
		}
		}
	public static void main (String[] args){
		LargeNum obj=new  LargeNum();
		obj.checkLargerNum();
	}
	}

