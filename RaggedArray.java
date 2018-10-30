package Chapter2;

public class RaggedArray {
public static void main(String args){
	int [][] h=new int [4][];
	 h[0]=new int[4];
	 h[1]=new int[2];
	 h[2]=new int[1];
	 h[3]=new int[3];
	 
	 h[0][0]=1;
	 h[0][1]=2;
	 //another way in writing the array
	 int [][] j= {
			 {1,2,3,4},
			 {1,2},
			 {1,2,3},
			 {1}
	 };
}
}
// They are 3 types of Arrays, single,muli,ragged dimensional.
