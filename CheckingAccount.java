package SettersandGetters;

public class CheckingAccount extends Account {
	CheckingAccount(long amount){
		super("",amount);
	}
	void withdraw(long amount){
		setAmount(getAmount()-amount);
		
		//alternate way to write this
		long temp=getAmount()-amount;
		setAmount(temp);
}
	
}
