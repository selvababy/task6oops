package task6oops;
import java.util.Scanner;

public class attributeCreate {
	String name;
	int age;
	
	public void getname(String nam)
	{
		name=nam;
		System.out.println("The Name is "+name);
	}
	public void getage(int agetemp)
	{
		age=agetemp;
		System.out.println("The age is "+age);
	}
	
	public attributeCreate()
	{
		System.out.println("The constructor of Class attributeCreate is called");
		}
	public static void main(String[] args) 
	{
		System.out.print("Enter the Name ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.print("Enter the age ");
		int age=sc.nextInt();
		attributeCreate attobj=new attributeCreate();
		attobj.getname(name);
		attobj.getage(age);
		sc.close();
	}

}
