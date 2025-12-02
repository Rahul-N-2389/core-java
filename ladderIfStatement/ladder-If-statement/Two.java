package ladderIfStatement;
import java.util.Scanner;
public class Two {
	public String calculationData(int a,int b,String st) {
		 String get ;
		 
		 System.out.println("-----------out put-----------X");
		if(st.equals("+")) {
			get="Addition : " + (a+b);
		}else if (st.equals("-")) {
			return "Subraction : " + (a-b);
			
		}else if (st.equals("*")) {
			get="Multiplication : " + (a*b);
		}else if (st.equals("/")) {
			get="Division" + (a/b);
			
		} else if (st.equals("%")) {
			get="Modulus" + (a%b);
		} else {
			return "Not Valid Calculation Type";
			
		}
		return get;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value :");
		int a=sc.nextInt();
		System.out.println("Enter B value :");
		int b=sc.nextInt();
		
		System.out.println("Enter Calculation Type :");
		String st=sc.next();
		
		String result=new Two().calculationData(a,b,st);
		System.out.println(result);
		sc.close();
	}

}
