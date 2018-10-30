package FinalKeyword;

public class bank {
	public static void main(String[] args) {
		Bank B=new Bank();
		Bank RBC=new Bank();
		Bank CIBC=new Bank();
		
		B.Interest();
		RBC.Interest();
		CIBC.Interest();
		
		System.out.println("" + B.Interest());
		System.out.println("" + RBC.Interest());
		System.out.println("" + CIBC.Interest());
		
	}
}
class Bank{
	
 double Interest()
	{
		return 3.5;
	}
}
class RBCBank extends Bank{
 double Interest()
	{
		return 5.54;
	}
}
class CIBCBank extends Bank{
	double Interest()
	{
		return 10.5;
	}
}



//super keyword is use to differeniante the members of super class from the member of subclass, if they have same names.