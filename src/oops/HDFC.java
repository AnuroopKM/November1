package oops;

import java.util.Scanner;

interface Bank{
	public void accountdetails();
	public void deposit();
	public void withdraw();
}
class Details implements Bank{
	Scanner sc=new Scanner(System.in);
	int accno,deposit,withdrawal;
	String name;
	int balance=20000;

	@Override
	public void accountdetails() {
		System.out.println("Name is: "+name);
		System.out.println("Account no: "+accno);
		
	}

	@Override
	public void deposit() {
		int deposit=10000;
		balance=deposit+balance;
		System.out.println("Balance ="+balance);
		
		
	}

	@Override
	public void withdraw() {
		int withdrawal=5000;
		balance=balance-withdrawal;
		System.out.println("Balance ="+balance);
		
	}
	
}
public class HDFC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Details ob=new Details();
ob.accountdetails();
ob.deposit();
ob.withdraw();

	}

}
