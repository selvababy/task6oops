package task6oops;
import java.util.Scanner;
public class Account {

	String accNumber;
	String accName;
	double balance;
	
	public Account()
	{
		
	}
	
	public Account(String accno,String accname)
	{
		accNumber=accno;
		accName=accname;
		this.balance =1000000;
		
	}
	
	public void withdraw(double wit)
	{
		this.balance=this.balance-wit;
		System.out.println("Your Amount has been withdraw from ur Account");
		this.checkbalance();
	}
	public void deposit(double dep)
	{
		this.balance=this.balance+dep;
		System.out.println("Your Amount has been deposited in ur Account");
		this.checkbalance();
	}
	public void checkbalance()
	{
		System.out.print("Your Current A/c Balance is ");
		System.out.println(this.balance);
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter the Account no.  ");
		Scanner sc=new Scanner(System.in);
		String accno=sc.next();
		System.out.print("Enter the Account Name:  ");
		String accname=sc.next();
		
		Account a=new Account(accno,accname);
		
		//System.out.print("Your Current A/c Balance is ");
		a.checkbalance();
		
		System.out.println("1.Deposits");
		System.out.println("2.Withdraw");
		System.out.println("3.Check balance");
		System.out.println("4.Exit");
		System.out.println("Choose any Activity Type any no. 1-4 : ");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the deposit Amount ");
			double dep=sc.nextDouble();
			a.deposit(dep);
			break;
		}
		case 2:
		{
			System.out.println("Enter the withdraw Amount ");
			double wit=sc.nextDouble();
			a.withdraw(wit);
			break;
		}
		case 3:
		{
			a.checkbalance();
		}
		default:
		{
			System.out.println("Invalid input ");
			break;
		}
		}
		
		
		

	}

}
