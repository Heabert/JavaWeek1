package Superkeyword;

public class DemoSuper1 {
public static void main(String[] args) {
	fish4 F=new fish4();
	F.printcolor();
	
}
}

class Animal4{
	
	String color="Black";
	
}

class fish4 extends Animal4{
	String color="pink";
	//this is the print method
	void printcolor() {
		System.out.println(color);
		//if you want just to get the color of animal you write
		System.out.println(super.color);
	}
}