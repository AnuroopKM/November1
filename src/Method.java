import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string: ");
String s=sc.nextLine();
System.out.println("Count of vowels in a string: "+count_Vowels(s));
	}
public static int count_Vowels(String s) 
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
		{
			count++;
		}
	}
		return count;
	}

}
