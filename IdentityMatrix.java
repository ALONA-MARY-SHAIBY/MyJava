package java10;
import java.util.Scanner;
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		int[][] matrix=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					matrix[i][j]=1;	
				}
				else {
					matrix[i][j]=0;
				}
			}
		}
			System.out.println("The matrix is:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}
		

	}

