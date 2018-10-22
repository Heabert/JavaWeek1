package ThisKeyword;

public class CallConstrucroeusingThis {
public static void main(String[] args) {
	B b=new B(5);
	
}
}
class B
{
 B() {
	 //this(5);
	System.out.println("the default constructor has been called!");
}

//to call this constructor you write.
 B(int i) {
	this();
System.out.println(i);	
}
}

// if you write void it will become a constructor and not method....