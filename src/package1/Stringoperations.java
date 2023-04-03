package package1;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hello welcome";
String s2="Hello";
String s3=new String("hello");

// String comparison
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));

System.out.println(s1==s3);
System.out.println(s1.equals(s3));

//Concat
System.out.println(s1.concat(s2));
System.out.println(7+2+"hello"+3+6);

//Length
System.out.println(s1.length());

//Startswith,endswith
System.out.println(s1.startsWith("h"));
System.out.println(s1.endsWith("o"));

//toupper,tolower
System.out.println(s2.toUpperCase());
System.out.println(s2.toLowerCase());

//charAt
System.out.println(s2.charAt(2));

//trim

System.out.println(s1.trim());

//contains
System.out.println(s1.contains("welcome"));

//substring
System.out.println(s1.substring(2,9));

//split
String a="hello welcome to luminar";
String ar[]=a.split(" ");
for(String v:ar) {
	System.out.println(v);
}
		}

}
