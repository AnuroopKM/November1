package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ob=new Methodoverloading();
ob.add();
ob.add(30,50);
ob.add(20,20.5);
ob.add(23.5,10);
	}

	public void add()
	{
		int a=20,b=30;
		int s=a+b;
		System.out.println(s);
		
	}
	public void add(int a,int b)
	{
		int s=a+b;
		System.out.println(s);
	}
	public void add(int a,double b)
	{
		double s=a+b;
		System.out.println(s);
	}
	public void add(double a,int b)
	{
		double s=a+b;
		System.out.println(s);
	}
}
