package Chapter2;
import java.util.Scanner;
public class MethodArray {
	public static void main(String[] args) {
		
		//create a method that will accept input from the array.
		Scanner input =new Scanner(System.in);
		int[] [] x=new int[4] [3];
		
		System.out.println("enter");
		for(int row=0;row<x.length;row++) {
			for(int col = 0;col < x[row].length;col++) {
				x[row][col]=input.nextInt();
			}
			}
		int total=0;
		for(int row=0;row<x.length;row++) {
			for(int col = 0;col < x[row].length;col++) {
				total=total+x[row][col];
			}
		
	}
		System.out.println(total);
}
}
	

	
	

