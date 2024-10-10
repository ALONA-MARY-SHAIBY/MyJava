package java10;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1;
		int i=1;
		int lim;
		System.out.println("Enter the limit:");
		lim=sc.nextInt();
		System.out.println("The series is:");
		while(i<=lim) {
			System.out.print(n1 + " ");
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}
		
	}

}
