package Condition__If;

 class Student {
	public void  checkStudentMarks(int marks){
	
	
	if (marks>=35 && marks<100){
	System.out.println("Pass");
	}
	if (marks<35){
	System.out.println("fail");
	}
    }
public static void main (String[] args){
new  Student().checkStudentMarks(60);
}
}