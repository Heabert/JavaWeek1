package Inheritance;

public class DemoMultilevelInheritance {
	public static void main(String[] args) {
		
		goldfish GF=new goldfish(); 
		GF.swim();
		GF.move();
		GF.eat();
		GF.shinny();
	}
	

}
class Animal1 {
	void move()
	{
		System.out.println("moving");
	}
void eat()
{
	System.out.println("eating..");
}

}
class fish1 extends Animal1 {
	void swim()
	{
		System.out.println("swiming...");
	}
}

class goldfish extends fish1{
	void shinny() {
		System.out.println("it is shinny");
	}
}