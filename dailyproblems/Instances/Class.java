package dailyproblems.Instances;

public class Class {
	static String universityName;
	String facultyName;
	String department;
	void showFacultyDetails() {
		System.out.println("University Name :"+universityName);
		System.out.println("Faculty Name :"+facultyName);
		System.out.println("Department :"+department);
		System.out.println("----------------");
	}
	

	public static void main(String[] args) {
		universityName="Standford University";
		Class Room1= new Class();
		Room1.facultyName="Dr.Robert Brown";
		Room1.department="Computer Science";
		
		Class Room2 = new Class();
		Room2.facultyName="Dr.Lisa Green";
		Room2.department="Physics";
		 Room1.showFacultyDetails();
		 Room2.showFacultyDetails();
	

	}

}
