package oops;

class Member
{
	String name,phoneno,address;
	int age,salary;

public void printdetails()
{
	System.out.println("Name is: "+name);
	System.out.println("Address is: "+address);
	System.out.println("Age is: "+age);
	System.out.println("Phoneno is: "+phoneno);
	System.out.println("Salary is: "+salary);
	
}
}
class Employeess extends Member{
	String specialization;

}
class Manager extends Member
{
	String department;
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employeess m=new Employeess();
m.name="Anuroop";
m.address="Kakkanad";
m.age=22;
m.phoneno="9845786545";
m.salary=2000;
System.out.println(m.specialization="Testing");
m.printdetails();
Manager e=new Manager();
e.name="Shebin";
e.address="Thrissur";
e.age=27;
e.phoneno="9845786545";
e.salary=20000;
e.printdetails();

	}
}
