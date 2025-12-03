package NewLogic;

import java.util.Scanner;
public class Loop2 {
	public void checkStatus() {
		Scanner sc=new Scanner(System.in);
         
         for(int i=0;i<3;i++){
        	 
    	     System.out.print("Enter Course : ");
    	     String s1=sc.next();
    	     System.out.print("Enter Marks : ");
    	     int x=sc.nextInt();
             System.out.printf("%-15s%03d\n",s1,x);
             //Complete this line
         }   
      }
	    public static void main(String[] args) {
	     Loop2 obj =new Loop2();
	     obj.checkStatus();
	}
}




