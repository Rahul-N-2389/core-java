package instancestype2;

public class Hello {
    String empname;
    String empdesg;
    int empsal;
    int empid;
public String getempname( ){
   return empname;
}
public void setempname(String  employeename){
 empname=employeename;
}
public String getempdesg( ){
   return empdesg;
}
public void setempdesg(String  employeedesignation){
 empdesg=employeedesignation;
}
public int getempsal( ){
   return empsal;
}
public void setempsal(int  employeesalary){
 empsal=employeesalary;
}
public int getempid( ){
   return empid;
}
public void setempid(int  employeeid){
 empid=employeeid;
}

public static void main(String[]args){
Hello obj= new Hello();

obj.setempname("Surya");
System.out.println(obj.getempname());
obj.setempdesg("Software");
System.out.println(obj.getempdesg());

obj.setempsal(30000);
System.out.println(obj.getempsal());

obj.setempid(2345);
System.out.println(obj.getempid());
}
}

 
    
