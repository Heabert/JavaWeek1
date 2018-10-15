package chapter4;

public class classwork {
	 

	public static void main(String [] args) {

	//palindrome string
	
	String str="burger";
	int length=str.length();
	String sr="";


	
	for(int i=length-1; i>=0;i--) {
		sr=sr+str.charAt(i);}

	boolean s=sr.equals(str);
	
	if(s==true)
	System.out.println("PALINDROME");
	else {
		System.out.println(" NOT PALINDROME");
	}
	

	
	}
}
