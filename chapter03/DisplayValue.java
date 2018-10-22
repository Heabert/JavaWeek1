package chapter03;

public class DisplayValue {
	int i; 
	String s;
	
	void display() {
		System.out.println("the value is"+1+"and"+s);
	}
	
	//creating a default constructor
	
	DisplayValue(){
		i=1;
		s="Hello";
	}
	
	
	//Parameterized constructor
	
	void Student(int age, String name){
		
		i=age;
		s=name;
	}
	
	public static void main(String [] args)
	{
		DisplayValue d1=new DisplayValue();
		d1.display();
		DisplayValue d2=new DisplayValue();
		d2.display();
		Student s1=new Student();
	
	}
	

}
 //DOT (.) operator to class method.