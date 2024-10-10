package Module3;
import java.io.*;
import java.util.Scanner;
class Myperson implements Serializable{
	int age;
	String name;
	Myperson(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
public class Objseri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		Myperson p=new Myperson(name,age);

		 try {
	            FileOutputStream f = new FileOutputStream("Person.txt");
	            ObjectOutputStream obj = new ObjectOutputStream(f);
	            obj.writeObject(p); 
	            obj.close();
	            f.close();
	            System.out.println("Serialized");
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
