package ThisKeyword;

public class Student {

// this is a reference variable that refers to the current object.
	
	int id;
	String name;
	//make constructor
	// the constructor doesn't have any return type
	Student(int i, String n){
		i=id;
		n=name;
		}
	//write the method
	void show()
	{
		System.out.println(id +""+name);
	}
}



