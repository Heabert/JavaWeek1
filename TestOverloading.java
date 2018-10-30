package Chapter1wk2;

public class TestOverloading {
	public static void main(String[] args)
	{
		int x= 10,y=20;
		int z= add(x,y);	
		System.out.println(""+z);
		
	}
 public static int add(int a,int b)
 {
	
	 int c=0;
	 c=a=b;
	 return c;
 }
}
