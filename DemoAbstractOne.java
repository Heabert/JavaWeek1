package AbstractCalss;

import AbstractCalss.DemoAbstractOne.Animal_2.chicken;
import AbstractCalss.DemoAbstractOne.Animal_2.chicken.tiger;

public class DemoAbstractOne {
public static void main(String [] args) {
	chicken KFC= new chicken();
	tiger TG=new tiger();
	
	System.out.println(KFC.sound());
	System.out.println(TG.sound());
}


abstract class Animal_2{
	private double weight;
	
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	abstract String sound();
	{
}
	class chicken extends Animal_2{
		String sound() {
			return" sound of chicken : Wake-up!!!!";
		}
		class tiger extends Animal_2{
			String sound() {
				return" sound of tiger : go to bed you chicken!!!!";
			}
			
			
		}
	}
}
}
	
