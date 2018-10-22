package chapter03;

public class ObjectOriented {
	ObjectOriented(){
		System.out.println("Object is created");
	}
public static void main(String[] args)
{
	
		ObjectOriented O1=new ObjectOriented();
	
	}
	
}




// Java-Object
//Class is a template of data fields or attributes.
//a constructor is nothing but a method with the same name as the class.
//rules for constructor
//1.constructor name must be same as its class name.
//2.a constructor  is not  having explicit return type(not even void)
//3.it is not ness to create a default constructor because, java complier creates a default constructor automatically if your class does not have any.
