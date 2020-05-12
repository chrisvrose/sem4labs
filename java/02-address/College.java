import java.util.Scanner;

public class College{
	private Address addr;
	private String name;
	public College(Address addr, String name){
		this.addr = addr;
		this.name = name;
	}

	static College getInput(Scanner in){
		Address addr = Address.getInput(in);
		System.out.println("Name");
		String name = in.next();
		return new College(addr,name);
	}
	public Address getAddress(){
		return addr;
	}

	public String toString(){
		return String.format("Name: %s,Address: %s", name,addr.toString());
	}
}	
