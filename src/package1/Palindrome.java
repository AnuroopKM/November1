package package1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1221,rev=0,r;
		int org=n;

		while(n!=0)
		{
		r=n%10;
		rev=rev*10+r;

		n=n/10;
		}
		if(org == rev){
		System.out.println(org + "is palindrome");
		}
		else{
		System.out.println(org + "is not palindrome");
		}
		

	}

}