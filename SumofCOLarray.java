package Chapter2;
import java.util.Scanner;
public class SumofCOLarray {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int[] [] x=new int[4] [3];
		
		
		for(int row=0;row<x.length;row++) {
			int total=0;
			for(int col = 0;col < x[row].length;col++) {
				total=total+x[row][col];
			}
		}
		System.out.println("");
}
}
