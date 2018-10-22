package ThisKeyword;

public class Invokementhodusingthis {
public static void main (String [] args) {
	A a=new A();
	a.m2();
}
}
class A
{
void m1() {
	System.out.println("");
}

void m2() {
	System.out.println("");
	this.m1();
	//just calling the other method without making a method in static void.
}
}