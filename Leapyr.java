package java10;
import java.util.Scanner;
public class Leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int yr;
		System.out.println("Enter the year:");
		yr=sc.nextInt();
		if((yr%4==0)&&!(yr%100==0)||(yr%400==0)) {
			System.out.println("The year is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
