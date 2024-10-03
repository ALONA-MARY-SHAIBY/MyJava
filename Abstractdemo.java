package java10;
import java.util.Scanner;
abstract class Employeee{
	abstract void calmonsal() ;
		String name;
		String type;
		Employeee(String name,String type){
			this.name=name;
			this.type=type;
		}
		public String getname() {
			return name;
		}
}
class FullTimeEmployeee extends Employeee{
	int salary;
	int hra=1000;
	FullTimeEmployeee(String name,int salary){
		super(name,"Fulltime");
		this.salary=salary;
	}
	void calmonsal() {
		salary=salary+hra;
		System.out.println(name+"'s" + "Salary: Rs."+ salary );
	}
}
class PartTimeEmployeee extends Employeee{
	int hrw;
	int hrsworked;
	int wrkdays=25;
	 PartTimeEmployeee(String name,int hrw,int hrsworked){
		 super(name,"Parttime");
		 this.hrw=hrw;
		 this.hrsworked=hrsworked;
	 }
	 void calmonsal() {
			hrw=hrw*hrsworked*wrkdays;
			System.out.println(name+"'s" + "Salary: RS."+ hrw );
		}
	
}
class Intern extends Employeee{
	int stipend;
	Intern(String name,int stipend){
		super(name,"Intern");
		this.stipend=stipend;
	}
	void calmonsal() {
		System.out.println(name+"'s" + "Stipend: RS."+ stipend );
	}
	
}
public class Abstractdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		String choice;
		do {
			System.out.println("Enter the name:");
			String name=sc.nextLine();
			System.out.println("Enter the  job type:");
			String type=sc.nextLine();
			if(type.toLowerCase().equals("full-time")) {
				System.out.println("Ener the salary:");
				int salary=sc.nextInt();
				FullTimeEmployeee ft=new FullTimeEmployeee(name,salary);
				ft.calmonsal();
			}
			else if(type.toLowerCase().equals("part-time")) {
				System.out.println("Enter the Hourly Wage:");
				int hrw=sc.nextInt();
				System.out.println("Enter the no of hours :");
				int hrsworked=sc.nextInt();
				PartTimeEmployeee pt=new PartTimeEmployeee(name,hrw,hrsworked);
				pt.calmonsal();
			}
			else if(type.toLowerCase().equals("intern")) {
				System.out.println("Enter stipend:");
				int stipend=sc.nextInt();
				Intern i=new Intern(name,stipend);
				i.calmonsal();
			}
			else {
				System.out.println("Invalid");
			}
			System.out.println("Do u want to continue:");
			sc.nextLine();
			choice=sc.nextLine();
		}
		while(choice.toLowerCase().equals("y"));
		if (!choice.equalsIgnoreCase("y")) {
            System.out.println("Exiting the program. Goodbye!");
        }
	}

}
