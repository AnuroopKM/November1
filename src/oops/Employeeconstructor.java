package oops;

public class Employeeconstructor {
int empid;
String empname;
String designation;

public Employeeconstructor(int empid,String empname,String designation) {
	this.empid=empid;
	this.empname=empname;
	this.designation=designation;
}
public void display()
{
	System.out.println("Employee id: "+empid);
	System.out.println("Employee name: "+empname);
	System.out.println("Designation: "+designation);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employeeconstructor emp=new Employeeconstructor(101,"Anuroop","Engineer");
emp.display();
	}

}
