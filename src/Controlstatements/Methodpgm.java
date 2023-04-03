package Controlstatements;

public class Methodpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodpgm s=new Methodpgm();
		s.add();
		s.sub(12,18);
		int ans=s.mul();
		System.out.println("Multiplication: "+ans);
		double divi=s.div(6,2);
		System.out.println("Divison: "+divi);
		}
	//without return type without parameters
public void add()
{
	int a=20,b=30;
	int c=a+b;
	System.out.println("Addition:" +c);
}
//without rt with p
public void sub(int a, int b) {
	int sub=a-b;
	System.out.println("Substraction:" +sub);
	
}
//with rt without p
public int mul() {
	int a=2,b=3;
	int mult=a*b;
	return mult;
	
}
//with rt with p
public double div(int a, int b) {
	int div=a/b;
	return div;
}
}
