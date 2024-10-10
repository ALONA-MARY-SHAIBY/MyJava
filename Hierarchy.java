package java10;
import java.util.Scanner;
class vehicle{
	String model;
	int year;
	void print_vehdet() {
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
	}
}
class cars extends vehicle{
	int nodoors;
	void print_doors() {
		System.out.println("Doors:"+nodoors);
	}
}
class Electriccar extends cars{
	int batterycapacity;
	void print_batterycap() {
		System.out.println("Battery capacity:"+batterycapacity+"kWh");
	}
}

public class Hierarchy {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		Electriccar obj2=new Electriccar();
		System.out.println("Enter the vehicle model:");
		obj2.model=sc.nextLine();
		System.out.println("Enter the year:");
		obj2.year=sc.nextInt();
		System.out.println("Enter the no of doors:");
		obj2.nodoors=sc.nextInt();
		System.out.println("Enter the battery capacity:");
		obj2.batterycapacity=sc.nextInt();
		System.out.println("Car details are:");
		obj2.print_vehdet();
		obj2.print_doors();
		obj2.print_batterycap(); 	

	}

}
