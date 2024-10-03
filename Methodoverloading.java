package java10;
import java.util.Scanner;
public class Methodoverloading {
	public int sum(int a,int b) {
		return a+b;
	}
	public String sum(String x,String y) {
		return x+y;
	}
	public int sum(int z) {
		return z+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Methodoverloading obj=new Methodoverloading();
		int n1,n2;
		System.out.println("Enter the integer:");
		n1=sc.nextInt();
		System.out.println("Enter the integer:");
		n2=sc.nextInt();
		int intResult=obj.sum(n1,n2);
		System.out.println("Sum is " + intResult);
		String str1;
		String str2;
		System.out.println("Enter the string:");
		str1=sc.next();
		System.out.println("Enter the string:");
		str2=sc.next();
		 String stringResult=obj.sum(str1, str2);
	        System.out.println("Concatenated string is: " + stringResult);
	        System.out.println("Enter a num:");
	        int incrementvalue=sc.nextInt();
	        int incrementResult=obj.sum(incrementvalue);
	        System.out.println("Incremented value is" + incrementResult);
	}

}
