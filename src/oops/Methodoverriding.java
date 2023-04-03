package oops;

class Rbi
{
	String name;
	public Rbi(String name)
	{
		this.name=name;
	}
	public void interest()
	{
		System.out.println("Interest is 8%");
	}
}
class Sbi extends Rbi
{

	public Sbi(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interest() {
		System.out.println("Interest is 7%");
		System.out.println(super.name);
		// TODO Auto-generated method stub
		super.interest();
	}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sbi ob=new Sbi("Anuroop");
ob.interest();
	}

}
