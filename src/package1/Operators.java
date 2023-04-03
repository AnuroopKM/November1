package package1;

public class Operators {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=30, b=20;
		//Relational operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		//assignment op(=,+=)
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		
		//Logical op(&&,||,!)
	String username="abc";
	String pswd="abc123";
	System.out.println(username=="abc" && pswd=="abc123");
	System.out.println(username=="abc" || pswd=="abc123");
	System.out.println(!(username=="abc"));
	System.out.println(!(pswd=="abc123"));
	
	//Unary op(++,--)
	
	int l=20;
	int j=l++;
	System.out.println(j);
	
	//Ternary op (?:)
	int o=20;
	int h=30;
	int z = (o<h)?o:h;
	System.out.println("value is "+z);

		
		
	}

}
