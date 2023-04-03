package oops;
interface Car1{
	public void speedlimit();
}
class Kia1 implements Car1{

	@Override
	public void speedlimit() {
		System.out.println("Kia speedlimit");
		
	}
	
}
class Bmw implements Car1{

	@Override
	public void speedlimit() {
		System.out.println("BMW speedlimit");
		
	}
	
}
public class Interpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car1 ob=new Kia1();
ob.speedlimit();
ob=new Bmw();
ob.speedlimit();
	}

}
