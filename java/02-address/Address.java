import java.util.Scanner;

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
	public Address(String onego){
		String[] segments= onego.split(",");
		street = segments[0];
		city = segments[1];
		state = segments[2];
		country = segments[3];
	}
	public Address(){
		this.street = new String();
		this.city = new String();
		this.state = new String();
		this.country = new String();
	}
	static public Address getInput(Scanner in){
		System.out.println("Street");
		String street = in.next();
		System.out.println("City");
		String city = in.next();
		System.out.println("State");
		String state = in.next();
		System.out.println("Country");
		String country = in.next();
		return new Address(street,city,state,country);

	}
	public String getAddress(){
		return this.street+"\n"+this.city+"\n"+this.state+"\n"+this.country;
	}
	public String toString(){
		return String.format("%s,%s,%s,%s",street,city,state,country);
	}
}
