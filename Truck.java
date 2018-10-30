package Inclasswork;

public class Truck extends Vehicle {
	
	private int tunnage;
	Truck(String make, String model, int year, int tunnage)
	{
		super(make,model,year);
		this.tunnage=tunnage;
	}

	void print()
	{
		System.out.println(getMake());
		System.out.println(getmodel());
		System.out.println(getyear());
	}

}
