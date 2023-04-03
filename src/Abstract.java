abstract class Car{
	abstract public void speedlimit();
	abstract public void airbag();
	public void cardetails() {
		System.out.println("Car details");
	}
}
class Maruti extends Car{

	@Override
	public void speedlimit() {
		
		System.out.println("Maruti: 100");
	}

	@Override
	public void airbag() {
	System.out.println("No");
		
	}
	
}
class Kia extends Car{

	@Override
	public void speedlimit() {
		System.out.println("Kia: 150");
		
	}

	@Override
	public void airbag() {
		System.out.println("Yes");
		
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti m=new Maruti();
		m.cardetails();
		m.airbag();
		m.speedlimit();
	
Kia ob=new Kia();
ob.cardetails();
ob.speedlimit();
ob.airbag();

	}

}
