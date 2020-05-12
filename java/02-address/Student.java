import java.util.Scanner;

public class Student {
	private Address addr;
	private String USN;
	private String name;
	Student(Address addr, String USN, String name){
		this.addr = addr;
		this.USN = USN;
		this.name = name;
	}

	static Student getInput(Scanner in){
		Address addr = Address.getInput(in);
		System.out.println("Name");
		String name = in.next();
		System.out.println("USN");
		String USN = in.next();
		return new Student(addr,USN,name);
	}

	Address getAddress(){
		return addr;
	}

	public String toString(){
		return String.format("Name: %s, USN: %s, Address: %s", name,USN,addr.toString());
	}

}
