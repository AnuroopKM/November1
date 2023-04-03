package package1;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20,b=0;
char op='/';
switch(op) {
case '+':
	System.out.println("a+b= "+(a+b));
			break;
			
case '-':
	System.out.println("a-b= "+(a+b));
			break;
			
case '*':
	System.out.println("a*b= "+(a*b));
			break;
			
case '/':
	if(b==0) {
		System.out.println("Not divisible by zero");
	}
	else {
	System.out.println("a/b= "+(a/b));
	}
			break;
}
	}
}
