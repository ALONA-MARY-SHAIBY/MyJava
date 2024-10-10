package java10;
import java.util.Scanner;
public class Dsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The matrix is:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		 int d1 = 0;
	        int d2 = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == j) {
	                    d1 += matrix[i][j];
	                } 
	                else if ((i + j) == n - 1) {
	                    d2 += matrix[i][j];
	                }
	            }
	        }
	        System.out.println("Diagonal 1 sum: " + d1);
	        System.out.println("Diagonal 2 sum: " + d2);

	}

}