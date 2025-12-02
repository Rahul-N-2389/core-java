package ladderIfStatement;

public class One {
	
	public String getData (int StudentId) {
		String Data;
		if(StudentId ==202511500) {
					Data=" Name		:Akash"
					+ "\n Year of Study	:1st year "
					+ "\n Place		:Hyderabad"
					+ "\n Pin No		:428181";
				} else if (StudentId ==202511501) {
						Data=   " Name		:Vijay"
							+ "\n Year of Study	: 1st year "
							+ "\n Place		: Pune"
							+ "\n Pin No		:521122";
				}else if(StudentId ==202511502) {
					Data=" Name          :Ram gopal Varma"
							+ "\n Year of Study : 4th year "
							+ "\n Place         :Mumbai "
							+ "\n Pin No        :621382";		
				}else if(StudentId ==202511503) {
					Data=        " Name          :Nagarjina"
							+ "\n Year of Study : 3rd year "
							+ "\n Place         :chennai "
							+ "\n Pin No        : 474712";
				}else {
					return " Data not found";
				}
		return Data;
	}

	public static void main(String[] args) {
		String result=new One().getData(202511505);
		System.out.println(result);
	

	}

}
