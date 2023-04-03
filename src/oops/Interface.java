package oops;
interface Animaldetails{
	public void breed();
	public void food();
}
interface Animalpet{
	public void petfood();
}
class Dogs implements Animaldetails,Animalpet{

	@Override
	public void breed() {
		System.out.println("Shebin");
		
	}

	@Override
	public void food() {
		System.out.println("Biriyani");
		
	}

	@Override
	public void petfood() {
		System.out.println("Rice");
		
	}
	
}
class Cat implements Animaldetails,Animalpet{

	@Override
	public void breed() {
		System.out.println("Sarath");
		
	}

	@Override
	public void food() {
		System.out.println("Mandhi");
		
	}

	@Override
	public void petfood() {
		System.out.println("Porotta");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat ob=new Cat();
ob.breed();
ob.food();
ob.petfood();
Dogs d=new Dogs();
d.breed();
d.food();
ob.petfood();
	}

}
