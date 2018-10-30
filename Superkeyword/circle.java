package Superkeyword;

public class circle {
public static void main(String[] args)
{  
	b2 b=new b2(20.0,21.5);
}

	private double radius;
		circle (double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea () 
	{ return radius * radius * Math.PI;
			};

}



 class b2 extends circle{
	private double length;
	
		 b2 (double radius, double length) {
		super(radius);
		this.length= length;
	}
		
	public double getArea () 
	{ return super.getArea()* length;}
} 
