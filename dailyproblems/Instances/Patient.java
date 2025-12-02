package dailyproblems.Instances;

public class Patient {
	static String hospitalName;
	String patientName;
	int age;
	void printDetails() {
		System.out.println("Hospital Name :"+hospitalName);
		System.out.println("Patient Name :"+patientName);
		System.out.println("Patient Age :"+age);
		System.out.println("--------------");
		
	}

	public static void main(String[] args) {
		hospitalName="City care Hospital";
		Patient ward1= new Patient();
		ward1.patientName="John Doe";
		ward1.age=45;
		
		Patient ward2=new Patient();
		ward2.patientName="emma Watson";
		ward2.age=30;
		ward1.printDetails();
		ward2.printDetails();
		
		
		

	}

}
