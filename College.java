package java10;
import java.util.Scanner;
class Student{
	String name;
	int id;
	String dept;
	Student(String name,int id,String dept){
		this.name=name;
		this.id=id;
		this.dept=dept;
	}
	void print_display() {
		System.out.println("Name is:"+name);
		System.out.println("ID is:"+id);
		System.out.println("Department is:"+dept);
	}
}
class Hosteler extends Student{
	String Hostelname;
	Hosteler(String name,int id,String dept,String Hostelname){
		super(name,id,dept);
		this.Hostelname=Hostelname;
	}
		void print_display() {
		super.print_display();
		System.out.println("Hostel name is:"+Hostelname);
	}
}
class Dayscholar extends Student{
	String busroute;
	Dayscholar(String name,int id,String dept,String busroute){
		super(name, id, dept);
		this.busroute=busroute;
	}
	void print_display() {
		super.print_display();
		System.out.println("Bus Route is:"+busroute);
	}	
}
public class College {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Deparment:");
		String dept=sc.nextLine();
		System.out.println("Enter the student type:");
		String studenttype=sc.nextLine();
		if(studenttype.equalsIgnoreCase("Hosteler")) {
		System.out.println("Enter Hostel name:");
		String Hostelname=sc.nextLine();
		Hosteler h=new Hosteler(name,id,dept, Hostelname);
		h.print_display();
		}
		else if (studenttype.equalsIgnoreCase("Dayscholar")){
		System.out.println("Enter Bus Route:");
		String busroute=sc.nextLine();
		Dayscholar d=new Dayscholar(name,id,dept,busroute);
		d.print_display();
		}
		else {
			System.out.println("Invalid details");
		}
	}
}



