package package1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 10;
int y = 20;

System.out.println("Before Swapping");
System.out.println("Value of x is :" + x);
System.out.println("Value of y is :" + y);		  
		  
swap(x, y);
}
private static void swap(int x, int y) {
int temp = x;
x = y;
y = temp;

System.out.println("After Swapping");
System.out.println("Value of x is :" + x);
System.out.println("Value of y is :" + y);
	}

}
