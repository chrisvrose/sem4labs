public class Student{
	private Address addr;
	private String USN;
	private String name;
	Student(Address addr, String USN, String name){
		this.addr = addr;
		this.USN = USN;
		this.name = name;
	}

	Address getAddress(){
		return addr;
	}

}
