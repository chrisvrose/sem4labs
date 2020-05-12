import java.util.Scanner;

public class Employee {
	private Address addr;
	private String name;
	private String empid;
	public Employee(Address addr,String name,String empid){
		this.addr = addr;
		this.name = name;
		this.empid = empid;
	}

	static Employee getInput(Scanner in){
		Address addr = Address.getInput(in);
		System.out.println("Name");
		String name = in.next();
		System.out.println("EMPID");
		String empid = in.next();
		return new Employee(addr,name,empid);
	}
	public Address getAddress(){
		return addr;
	}
	public String toString(){
		return String.format("Name: %s, Emp. ID:%s, Address: %s", name,empid,addr.toString());
	}
	
}	
