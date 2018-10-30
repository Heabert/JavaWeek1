package MethodOverWriting;

public class Demomethodoverwriting {
public static void main(String[] args) {
	Acollege AC=new Acollege();
	Bcollege BC=new Bcollege();
	Ccollege CC=new Ccollege();
	
	AC.getfees();
	BC.getfees();
	CC.getfees();
	System.out.println("" + AC.getfees());
	System.out.println("" + BC.getfees());
	System.out.println("" + CC.getfees());
}
}

class college
{   
	int getfees()
	{
		return 50;
	}
}

class Acollege extends college
{
	int getfees()
	{
		return 100;
	}
}
class Bcollege extends college
{
	int getfees()
	{
		return 80;
	}
}
class Ccollege extends college
{
	int getfees()
	{
		return 60;
	}
}

// What is method over writing,if child has the same method as declared in parent class that is called method overwriting.
//Rules of Over Writing 
//1. The method of child class is the have the same name as the parent class
//2. Method must have the same parameters as in parent class
//3.the instance can be overriding only if they are inherited by a sub class