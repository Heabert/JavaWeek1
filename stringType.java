package chapter4;

import java.util.Scanner;

public class stringType {
	public static void main(String[] args)
	{
			System.out.println(Character.isLetter('A'));
			System.out.println(Character.isLetter('0'));
			
			char ch=Character.toUpperCase('b');
			System.out.println(ch);
			
			//string functions
			//length
			String str="Heabert";
			int e=str.length();
			System.out.println("the length of" + str + "is"+ e);
			System.out.printf("the length of %s is %d", str, e);
			
		   //Concatenation
			
			String name="Heabert" + "Cameron";
			System.out.println(name);
		//concatenation function
			
			String N1="Heabert";
			String N2="Cameron";
			String N3=N1.concat(N2);
			System.out.println(N3);
		//name to upperCase
			System.out.println(N3.toUpperCase());
		//continued
			
			int result=N1.compareTo(N2);
			System.out.println(result);
		
				
			//LOOPS
			//for loop
			for(int x = 10; x < 20; x = x + 1) {
		         System.out.print("value of x : " + x );
		         System.out.print("\n");
		      }
			
			//while loop
			int y=10;
			while(y<20)
			{
				System.out.println("value of x:" + y);
				System.out.println("\n");
				y++;
			}
			//DO-WHILE
			 int x = 10;

		      do {
		         System.out.print("value of x : " + x );
		         x++;
		         System.out.print("\n");
		      }while( x < 20 );
		   
	//MuliTable
		      int Mul=1;
		      for(int i=1;i<11;i++);
		      {
		    	  for(int j=1;j<11;j++)
		    	  {
		    	 
		    	  Mul=1*j;
		    	  System.out.println(1*j+"");
		    	  }
		      
		     System.out.println(" ");
	}
		      
		      
	}
}
			

			
			
			
	

