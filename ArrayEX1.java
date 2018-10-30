package Chapter2;

public class ArrayEX1 {
	public static void main(String[] args) {
//SUMELEMENTSARRAY		
//Create an arrays of 4rows and 3 col and do sum of all the elements
		int total=0;
		int [] [] x= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
			};
		for(int row=0;row<x.length;row++) {
			for(int col = 0;col < x[row].length;col++) {
				total=total+x[row][col];
			}
			System.out.println(total);
		 
		
	}
}
}

//create a method that will accept input from the array.



