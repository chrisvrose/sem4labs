import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int n1 = in.nextInt();
		Student[] s = new Student[n1];
		System.out.println("Enter number of Colleges");
		int n2 = in.nextInt();
		College[] c = new College[n2];
		System.out.println("Enter number of Employees");
		int n3 = in.nextInt();
		Employee[] n = new Employee[n2];

		System.out.println("Students");
		for(int i=0;i<n1;i++){
			s[i] = Student.getInput(in);
		}
		System.out.println("College");
		for(int i=0;i<n2;i++){
			c[i] = College.getInput(in);
		}
		System.out.println("Employees");
		for(int i=0;i<n3;i++){
			n[i] = Employee.getInput(in);
		}

		for(Student student:s){
			System.out.println(student);
		}
		for(College college:c){
			System.out.println(college);
		}
		for(Employee employee:n){
			System.out.println(employee);
		}



		//For colleges





		in.close();
		//Student[] s = new Student()[n1];
		//College[] c = new College()[n2];
		//Employee[] e = new Employee()[n3];

	}
}
