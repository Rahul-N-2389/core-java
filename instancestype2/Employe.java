package instancestype2;

public class Employe {
	String employeeName;
	String employeeId;
	int employeeSalary;
	public void addEmployeeDetails(String name,String id,int salary ) {
		employeeName=name;
		employeeId=id;
		employeeSalary=salary;
		
	}
public void displayditails() {
	
	System.out.println( "employe name :"+employeeName);
	System.out.println( "employ id :"+ employeeId);
	System.out.println("employe salary :"+employeeSalary);
	
}
	public static void main(String[] args) {
		Employe Employee=new Employe();
		Employee.addEmployeeDetails("ramu","software",30000);
		
		
		Employee.displayditails();
		
		
		
	
	

	}

}
