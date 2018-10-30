package ChapterTwo;

import java.util.Scanner;

public class MathFunction {
	public static void main(String[] args)
	{
		
		
		System.out.println(Math.sin(0));
		System.out.println(Math.cos(0));
		System.out.println(Math.cos(Math.PI/2));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.log(2));
		System.out.println(Math.exp(3));
		
		
		//Rounding methods
		
		double d = 100.675;
		double e = 100.500;
		float f= 100;
		float g = 90f;
		System.out.println(Math.round(d));
		System.out.println(Math.round(f));
		
		//max and min
		
		System.out.println(Math.max(12.123, 12.456));
		System.out.println(Math.min(12.123, 12.456));
		
		//sealing and floor
		double o = -100.675;
		float  p= -90;
		
		System.out.println(Math.floor(o));
		System.out.println(Math.floor(p));
		
		System.out.println(Math.ceil(o));
		System.out.println(Math.ceil(p));
		//Generates a random number between 0-9
		int Number1=(int)(Math.random()*10);
		int Number2=(int)(Math.random()*10);
		System.out.println(Number1);		
		System.out.println(Number2);
		
		//ASCII value
		
		char ch='A';
		System.out.println(++ch);
		
		int i=(int)'a';
		System.out.println(i);
		
		int  j=4+'b';
		System.out.println(i);
		
		//operator list
		// and(&), or(||), not(!), XOR(^)
		
		//Question
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int num2=input.nextInt();
		
		if((num2 % 2 == 0)&&(num2 % 3 ==0))		
		{
	         System.out.println("Given number is divisible by 2 and 3 ");
		}
		if((num2 % 2 == 0)||(num2 % 3 ==0))		
		{
	         System.out.println("Given number is divisible by 2 or 3 ");
		}
		if((num2 % 2 == 0)^(num2 % 3 ==0))		
		{
	         System.out.println("Given number is divisible by 2 or 3 but not both ");
		}
		
		//leap year
		
	/*	Scanner input=new Scanner(System.in);
		System.out.println("Please enter year");
		int leapyear=input.nextInt();
		
		if(((leapyear % 4 == 0)&& (leapyear % 100!= 0))||(leapyear % 400 ==00))
					{System.out.println("  ");
		*/

		
		
		
		
		
		
		
		
		}
	}
}
	



