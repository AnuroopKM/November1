abstract class car{
	abstract void speed();
	void brand() {
		System.out.println("Maruti");
	}
}

public class Abstraction extends car{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstraction ob=new Abstraction();
ob.speed();
ob.brand();
	}

}
