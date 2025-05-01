package task6oops;
import java.util.Scanner;
public class circle 
{

	float radious;
	
	public circle()
	{
		System.out.println("Default Constructor of Circle class called.");
	}
	public circle(float pi,float radious)
	{
		System.out.println("Two Argument Constructor of Circle class called.");
		float circum=2*pi*radious;
		System.out.println("The circumference of circle is : "+circum);
		
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the radious: ");
		Scanner sc=new Scanner(System.in);
		float rad=sc.nextFloat();
		circle c=new circle();
		circle r=new circle(3.14f,rad);
		
	}

}
