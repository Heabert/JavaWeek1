package Inheritance;
//single level inheritance

public class DemoInheritance {
	
	public static void main(String[] args) {
		fish FN = new fish();
		FN.swim();
		FN.move();
		FN.eat();
	}
		
	class Animal {
		void move()
		{
			System.out.println("moving");
		}
	void eat()
	{
		System.out.println("eating..");
	}

	}
	class fish extends Animal {
		void swim()
		{
			System.out.println("swiming...");
		}
		
	}
}
	
	//side not (multiple inheritance is not allowed in Java)

 