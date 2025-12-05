package loops;

public class EvenNumber {

	public static void main(String[] args) {
		
		
		String str=" ";
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				str=str+i+" ";
				
			}
			
		}System.out.println("Odd numbers : "+str);
	}
}
