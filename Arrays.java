package Chapter1wk2;

public class Arrays {
	public static void main(String[] args) {
		
	
//create an arrays of size five, of integer type, and print the elements of the array
	
	int[] numbers= {1,2,3,4,5};
	for(int i=0; i<5; i++)
		
	System.out.println("" +i +"is"+numbers[i]);
	
	for(int j:numbers) {
		System.out.println(""+j);
	}
	
}
}
//Why do we need to use arrays, it is the collection of values of the same data type.