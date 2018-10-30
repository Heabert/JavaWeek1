package SettersandGetters;

public class DemoAccount {
public static void main(String[] args) {
	
	SavingAccount sa = new SavingAccount(20000);
	System.out.println(""+sa.getAmount());
	System.out.println(sa.getName());
	sa.Deposit(10000);
	System.out.println("after deposit"+sa.getAmount());
	
	CheckingAccount ca = new CheckingAccount(40000);
	System.out.println("" + ca.getAmount());
	ca.withdraw(15000);
	System.out.println("" + ca.getAmount());
}
}
