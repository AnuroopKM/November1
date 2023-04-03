package oops;

public class MerhodCons {
int empid;
String empname;
String designation;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MerhodCons ob=new MerhodCons();
ob.setvalue(101,"Anuroop","Engineer");
ob.display();
	}
	public void setvalue(int empid,String empname,String designation)
	{
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

}