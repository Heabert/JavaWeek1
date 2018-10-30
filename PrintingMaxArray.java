package Chapter1wk2;

public class PrintingMaxArray {
	public static void main(String[] args) {
		int[] IntArray={10,20,30,40};
		int max= IntArray[0];
		
		for(int i=0; i<5;i++) {
			if(IntArray[i]>max) {
				max=IntArray[i];
			}
			
		}
		System.out.println(max);
	}

}
// comparing and printing the array from the next value.