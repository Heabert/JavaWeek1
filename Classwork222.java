package InterfaceJava;
import java.util.Scanner;

public class Classwork222 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("enter numbers ");
	
	int n3=input.nextInt(); 
	int n4=input.nextInt(); 
	
	//without using     exceptional handling, write it like this(add if conditions)
	if(n3==0)
		System.out.println("");
	else
	System.out.println("your result is  " + n3/n4);
	 
	
	}
}
