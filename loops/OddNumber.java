package loops;

public class OddNumber {

	public static void main(String[] args) {
		
		
		String str=" ";
		for(int i=0;i<=50;i++) {
			if(i%2==1) {
				str=str+i+" ";
				
			}
			
		}System.out.println("Odd numbers : "+str);

	}

}
