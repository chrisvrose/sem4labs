public class Address{
	private String street;
	private String city;
	private String state;
	private String country;
	public Address(String street,String city,String state,String country){
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Address(){
		this.street = new String();
		this.city = new String();
		this.state = new String();
		this.country = new String();
	}
	public void getInput(Scanner in){
		System.out.println("Street");
		street = in.next();
		System.out.println("City");
		city = in.next();
		System.out.println("State");
		state = in.next();
		System.out.println("Country");
		country = in.next();
	}
	public String getAddress(){
		return this.street+"\n"+this.city+"\n"+this.state+"\n"+this.country;
	}
}
