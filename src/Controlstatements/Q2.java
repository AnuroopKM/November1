package Controlstatements;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java";
String s1="language";
System.out.println(s.concat(s1));

String s3="java is platform independent language";
if(s3.contains("platform")) {
	System.out.println("Contains platform in s3");}
	else
	{
	System.out.println("Not contains platform in s3");	
	}
String ar[]=s3.split(" ");
for(String v:ar) {
	System.out.println(v);
	if(v.equals("independent")) {
		break;
	}

}
	}

}
