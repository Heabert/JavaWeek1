package SettersandGetters;

public class Account{
	public static void main(String[] args) {
		
	}
	private String name;
	private Long amount;
	
	Account(String name, long amount){
		this.name=name;
		this.amount=amount;
	} 
	public String getName()
	{
		return name;
	}
	public long getAmount()
	{
		return amount;
	}
	public void setAmount(long amount)
	{
		this.amount=amount;
	}
	
	void Deposit(long amount)
	{
		this.Deposit(amount);
	}
	
}
//setter is used to update the private data members.
