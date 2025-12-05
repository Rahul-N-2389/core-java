package dailyproblems;

public class Test6 {
static int marks1=78;
static int marks2=85;
static int marks3=90;
public static int total() {
	 int tot = (marks1+marks2+marks3);
	
    return tot;

}
public static double percentage() {
	double per=(total()/300.0)*100;
	return per;
}
	public static void main(String[] args) {
		System.out.println("total:"+total());
		System.out.println("percent:"+percentage());


	}

}
