package FinalKeyword;

class vehicle
{
void speed() {
	System.out.println("");
}	
}
public class bike extends vehicle {
	void speed()
	{
		System.out.println("the speed of the bike is 150");
	}public static void main(String[] args) {
	bike B=new bike();
	B.speed();
}
}
//Final rule.
//If you write final in front of any class, that class cannot be inherited