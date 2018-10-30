package SettersandGetters;

public class DemoSetters {
public static void main(String[] args) {
	address Address = new address();
	//System.out.println("a.phone"); not allowed
	//you cannot access the a.phone because it's in private, please the print within private to get the info.
	System.out.println(Address);
	String ph=Address.getPhone();
	//this is the only way you can access/print private data.
	
	//updating the value of phone
	
}
}
class address{
	private String phone="123456789";
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		 phone=phone;
		 System.out.print(this.phone);
		 
	 }
}
