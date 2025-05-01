package task6oops;

import java.util.Scanner;

public class Employee 
{
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public void getid(int idtemp)
	{
		id=idtemp;
		System.out.println("The id is "+id);
	}
	public void getfirstName(String fname)
	{
		firstName=fname;
		System.out.println("The First Name is "+firstName);
	}
	public void getlastName(String lname)
	{
		lastName=lname;
		System.out.println("The Last Name is "+lastName);
	}
	
	public void getName()
	{
		String name=firstName+lastName;
		System.out.println("The Name is "+name);
	}
	
	public void getSalary(int sal)
	{
		salary=sal;
		System.out.println("The Salary is "+salary);
	}
	
	public void setSalary(int salnew)
	{
		salary=salnew+salary;
		System.out.println("The New Revised salary is "+salary);
	}
	public void getAnnualSalary()
	{
		int sal=salary*12;
		System.out.println("The Annual Salary is "+sal);
	}
	public int raiseSalary(int perc)
	{
		int sal=salary*perc/100;
		System.out.println("The Raised Salary is "+sal);
		return sal;
	}

	public static void main(String[] args) 
	{
		System.out.print("Enter the ID ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.print("Enter the First Name ");
		String fname=sc.next();
		System.out.print("Enter the Last Name ");
		String lname=sc.next();
		System.out.print("Enter the Salary ");
		int sal=sc.nextInt();
		
		Employee attobj=new Employee();
		attobj.getid(id);
		attobj.getfirstName(fname);
		attobj.getlastName(lname);
		attobj.getSalary(sal);
		
		attobj.getName();
		System.out.print("Enter the Percentage of salary to be want to raise ");
		int percent=sc.nextInt();
		int raise=attobj.raiseSalary(percent);
		
		attobj.setSalary(raise);
		attobj.getAnnualSalary();
		sc.close();

	}

}
