package oops;

class animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends animal
{
	void bark()
	{
		System.out.println("Barking");
		}
	}
class baby extends Dog
{
	void weep()
	{
		System.out.println("weeping");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
baby d=new baby();
d.weep();
d.bark();
d.eat();
	}

}
