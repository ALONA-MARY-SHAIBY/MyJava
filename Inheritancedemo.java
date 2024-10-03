package LAB2024;
import java.util.Scanner;
class Employee{
	String name;
	int age;
	long phno;
	String address;
	int salary;
	void print_Salary() {
		System.out.println("Salary is:"+ salary);
	}
	 void print_Employee(){
		 System.out.println("Name is:"+ name);
		 System.out.println("Age is:"+ age);
		 System.out.println("Phone no is:"+ phno);
		 System.out.println("Address is:"+ address);
}
}
class Officer extends Employee{
	String specialization;
	void print_Spc() {
		System.out.println("specialization is:"+ specialization);
	}
	}
class Manager extends Employee{
	String department;
	void print_dep() {
		System.out.println("Department is:" + department);
	}
}
public class Inheritancedemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Officer obj1=new Officer();
		Manager obj2=new Manager();
		System.out.println("Enter the name:");
		obj1.name=sc.nextLine();
		System.out.println("Enter age:");
		obj1.age=sc.nextInt();
		System.out.println("Enter phone no:");
		obj1.phno=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter address:");
		obj1.address=sc.nextLine();
		System.out.println("Enter salary:");
		obj1.salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Specialization:");
		obj1.specialization=sc.nextLine();
		System.out.println("Enter the name:");
		obj2.name=sc.nextLine();
		System.out.println("Enter age:");
		obj2.age=sc.nextInt();
		System.out.println("Enter phone no:");
		obj2.phno=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter address:");
		obj2.address=sc.nextLine();
		System.out.println("Enter salary:");
		obj2.salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter department:");
		obj2.department=sc.nextLine();
		System.out.println("Officer details are:");
		obj1.print_Employee();
		obj1.print_Salary();
		obj1.print_Spc();
		System.out.println("Manager details are:");
		obj2.print_Employee();
		obj2.print_Salary();
		obj2.print_dep();
	}
}