package Chapter1wk2;

public class MethodOverloading {
	public static void main(String[] args)
	{
		//creating the object class adder
		Adder ad=new Adder();
		
		int c=ad.add(10, 30);
		System.out.println(c);
		
		int answer=ad.add(10,20,30);
		System.out.println(answer);
		
		double ans=ad.add(10.2,50.4);
		System.out.println(ans);
	}
}
//Creating a class within a class.

class Adder{
	public int add(int a, int b) {
		return a+b;
	}
	//adding extra number of arguments or method overloading
	//if a class is having multiple methods with the same name but different in parameters this is called method overloading
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	public double add(double a, double b) {
		return a+b;
	}
}



//Any class can have methods and variables
//object is an instance/blueprint of a class