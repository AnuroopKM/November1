import java.util.Scanner;

public class Charlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String: ");
String str=sc.nextLine();
System.out.println("No:of characters in the string: "+countChar(str));

	}
	public static int countChar(String str)
	{
int count=0;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)!=' ') 	
	count++;
}
	
return count;
}
}