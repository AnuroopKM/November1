package oops;

import java.util.Scanner;

interface Bank{
	public void accountdetails();
	public void depost();
	public void withdraw();
}
class Det implements Bank{
	static String Bankname="sbi";
int accno;
String name;
	int balance=20000;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountdetails() {
		// TODO Auto-generated method stub
		System.out.println("Bank name: "+Bankname);
		System.out.println("Account No: ");
		int accno=sc.nextInt();
		System.out.println("Entered accno: "+accno);
		System.out.println("Your name: "+name);
		System.out.println("Your balance: "+balance);
		
	}

	@Override
	public void depost() {
		// TODO Auto-generated method stub
		System.out.println("Deposit: ");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Balance after deposit:; "+balance);
		
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw");
		int withdrawal=sc.nextInt();
		balance=balance-withdrawal;
		System.out.println("Balance after withdrawal: "+balance);
		
	}
	
}
public class IDFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Det ob=new Det();
		ob.accountdetails();
		ob.depost();
		ob.withdraw();
	}

}
