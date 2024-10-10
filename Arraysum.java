package java10;
import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of elements is:" + sum);

	}

}
