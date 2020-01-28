public class Employee{
	private Address addr;
	private String name;
	private String empid;
	public Employee(Address addr,String name,String empid){
		this.addr = addr;
		this.name = name;
		this.empid = empid;
	}
	public Address getAddress(){
		return addr;
	}
}	
