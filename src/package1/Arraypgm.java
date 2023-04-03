package package1;

import java.util.Scanner;

public class Arraypgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[] a=new int[3];
System.out.println("Enter numbers:");
for(int i=0;i<=2;i++) {
	a[i]=sc.nextInt();
}
for(int v1:a) {
	System.out.println(v1);
	}
}

}
