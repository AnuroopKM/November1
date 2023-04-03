package oops;


public class Employee {
int empid;
String empname;
String designation;

public void display()
{
	System.out.println("Employee id: "+empid);
	System.out.println("Employee Name: "+empname);
	System.out.println("Designation: "+designation);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();
emp.empid=101;
emp.empname="Anuroop";
emp.designation="SW Engg";
emp.display();
Employee emp1=new Employee();
emp1.empid=102;
emp1.empname="Shebin";
emp1.designation="Developer";
emp1.display();
	}


}
