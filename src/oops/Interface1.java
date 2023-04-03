package oops;
interface BasicAnimal{
	public void cat();
	public void sleep();
}
class Monkey{
	void jump() {
		System.out.println("Jump");
	}
	
	void bite() {
		System.out.println("Bite");
	}
}
class Human extends Monkey implements BasicAnimal{
	public void speak() {
		System.out.println("Speak");
	}

	@Override
	public void cat() {
		System.out.println("Cat");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep");
		
	}
}


public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human m=new Human();
m.jump();
m.bite();
m.cat();
m.speak();
m.sleep();
}
}