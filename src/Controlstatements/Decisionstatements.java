package Controlstatements;

public class Decisionstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if else,if
int x=30,y=-10;
if(x>0) 
{
System.out.println("x is positive");	
}
else
{
	System.out.println("y is negative");	
}
	
//else if
if(y<0)
{
	System.out.println("y is negative");

}
else if(y>0) {
	System.out.println("y is positive");	
	
}
else {
	System.out.println("Not positive and negative");	
}

//nested if
if(x!=y)
{
	if(x>0)
	{
		System.out.println("x is positive");	
		
		
	}
}
else
{
	System.out.println("x is not positive");	
}

//Even or odd

int a=21;
if(a%2==0) {
	System.out.println("Number is even");
}
else {
	System.out.println("Number is odd");
}

//Q1
int c=20,d=40,e=30;
if(c>d && c>e)
{
	System.out.println("c is greater");
}
else if(d>e && d>a) {
	System.out.println("d is greater");
}
else {
	System.out.println("e is greater");
}


//switch
int day=3;
switch(day) {
case 1:System.out.println("Monday");
break;
case 2:System.out.println("Tuesday");
break;
case 3:System.out.println("Wednesay");
break;
case 4:System.out.println("Thursday");
break;
case 5:System.out.println("Friday");
break;
default:System.out.println("Invalid choice");
}
		

	}
	
}


