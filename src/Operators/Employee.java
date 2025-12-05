package Operators;

public class Employee {
		String name;
		double Salary;
		
	public void increaseSalary(Employee e) {
		
		Employee.e displaySalary=Salary+(Salary*10/100);
		
		System.out.println("Updated salary of " +name +" is :" +displaySalary);	}

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.name="Robin";
		obj.Salary=50000.0;
		
		obj.increaseSalary();
		

	}

}
