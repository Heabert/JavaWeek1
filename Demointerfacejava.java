package InterfaceJava;

public class Demointerfacejava {
public static void mian(String[] args) {
	//EDIBLE E=NEW EDIBLE();--CAN NOT INSTANTIATE OBJECT OF INTERFACE
	//FRUIT F=NEW FRUIT();--CAN NOT INSTANTIATE OBJECT OF OBJECT CLASS
	apple Apple=new apple();
	Apple.howtoEat();
	System.out.println("" + Apple.howtoEat());
	
	
	orange OJ=new orange();
	OJ.howtoEat();
	System.out.println("" + OJ.howtoEat());
	
	chicken KFC=new chicken();
	KFC.howtoEat();
	System.out.println("" + KFC.howtoEat());
	
	
}
}

abstract class fruit implements Edible{
	//only if you don't want to write anything with this method
	
}

class apple extends fruit{
	public String howtoEat() {
		return" apple: make slices";
	}
}

class orange extends fruit{
	public String howtoEat() {
		return"organe: make joice";
	}
}

class chicken implements Edible{ // implement the interface, because its something to eat.
	public String howtoEat() {
		return"KFC";
	}
}

//EVERY METHOD MUST HAVE A RETURN TYPE

//exception is an unexpected error which is arising at run time and it disturbs the normal flow of program
//exception handling: if the exception is not handled properly then the program with terminate abnormally and the application will crash.
//so by applying the mechanizism of exception handling, we can terminate our program gracefully.