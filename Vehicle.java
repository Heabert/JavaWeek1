package Inclasswork;

public class Vehicle {

private String  make;
private String model;
private int year;


Vehicle(String make, String model, int year){
	this.make=make;
	this.model=model;
	this.year=year;
	
	
}
public String getMake() {
	return make;
}
public String getmodel() {
	return model;
}
public int getyear() {
	return year;
}

void print()
{
	System.out.println(make+model+year);
}
}