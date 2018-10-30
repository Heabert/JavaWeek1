package ChapterOne;

import java.util.Scanner;

public class FindingTheAreaofAcircle {
	
	public static void main(String [] args)
	{
		
		double radius;
		final double PI=3.14;
		
		//Creating the object of scanner class.
		Scanner input=new Scanner(System.in);
		System.out.println("Enter radius");
		radius=3.0f;
		radius=input.nextDouble();  
		
		
		double p=perimeter(radius);
		System.out.printf("the perimenter is %f", p);
		
		double a=area(radius);
		System.out.printf("the area is %f", a);
		
}
	//definition of the function.
	//return type, name of function(parameters)
	public static double perimeter(double radius)

		{
             double ans;
             ans=2*3.14*radius;
             return ans;
		}
	public static double area(double radius)
	
			{
					double ans;
					ans=3.14*(radius*radius);
					return ans;
		
		
			}
	}


