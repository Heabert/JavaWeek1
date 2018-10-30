package Superkeyword;

public class DemoSuper2 {
	public static void main(String[] args) {
		fish5 F2=new fish5();
		F2.eat();
	}
}
class Animal5{
	void eat() {
		System.out.println("");
	}
}
class fish5 extends Animal5{
	void eat() {
		System.out.println("");
		//calling the class but not printing it
		super.eat();
	}
}