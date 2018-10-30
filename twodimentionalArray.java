package Chapter1wk2;

public class twodimentionalArray {
	public static void main(String[] args) {
		
		int [] [] b= new int [5][5];
		b[0][0]=1;
		b[0][1]=2;
		b[1][0]=4;
		b[1][1]=3;
		b[1][2]=5;
		for(int row=0; row<b.length;row++) {
			for(int col = 0;col < b[row].length;col++) {
				System.out.println(b[row][col]);
			}
			
		}
		
	}

}
