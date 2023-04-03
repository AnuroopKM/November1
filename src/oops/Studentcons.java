package oops;

public class Studentcons {
int studentid;
String name;
String course;
public Studentcons(int studentid,String name,String course)
{
	this.studentid=studentid;
	this.name=name;
	this.course=course;
}
public void display()
{
	System.out.println("Student id: "+studentid);
	System.out.println("Student name: "+name);
	System.out.println("Student course: "+course);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentcons stu=new Studentcons(101,"Anuroop","Testing");
stu.display();
Studentcons stu1=new Studentcons(102,"Shebin","Python");
stu1.display();
	}

}
