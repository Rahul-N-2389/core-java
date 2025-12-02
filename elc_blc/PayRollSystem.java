package elc_blc;

public class PayRollSystem {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.employeeId=1420;
		obj.employeeName="Robin Hood";
		obj.salary=35000;
		
		
		System.out.println("Employee Id : " + obj.getEmployeeId());
		System.out.println("Employee Name : "+obj.getEmployeeName());
		System.out.println("Employee Salary : "+obj.getSalary());
		
		obj.setSalary(25000);
		System.out.println("Employee Salary : "+obj.getSalary());

	}

}
