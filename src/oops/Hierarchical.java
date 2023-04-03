package oops;
class Grandfather
{
	void grand()
	{
		System.out.println("Grandfather");
	}
}
class Father extends Grandfather{
	void father()
	{
	System.out.println("Father");
	}
}
class Grandson extends Grandfather
{
	void grandson()
	{
		System.out.println("Grandson");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grandson g=new Grandson();
g.grandson();
Father f=new Father();
f.father();
g.grand();

	}

}
