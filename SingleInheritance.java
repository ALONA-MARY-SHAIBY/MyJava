package java10;
import java.util.Scanner;
class Employee{
String name;
int E_id;
void print_name() {
	System.out.println("Name is:"+ name);
}
void print_Id(){
	System.out.println("Employee id is:" + E_id);
}
}
class Manager extends Employee{
	String name;
	int age;
	String dept;
	int salary;
	void print_manager() {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Department is:"+dept);
		System.out.println("Salary is:"+salary);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		//single inheritance 
		Scanner sc = new Scanner(System.in);
		Employee obj1=new Employee();
		Manager obj2=new Manager();
		System.out.println("Enter the name:");
		obj1.name=sc.nextLine();
		System.out.println("Enter the Id:");
		obj1.E_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		obj2.name=sc.nextLine();
		System.out.println("Enter the age:");
		obj2.age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the department:");
		obj2.dept=sc.nextLine();
		System.out.println("Enter the salary:");
		obj2.salary=sc.nextInt();
		System.out.println("Employee Details are:");
		obj1.print_name();
		obj1.print_Id();
		System.out.println("Manager Details are:");
	    obj2.print_manager();
		
		
		

	}

}
