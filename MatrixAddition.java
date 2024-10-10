package java10;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int r1,c1,r2,c2;
		 System.out.println("Enter the number of rows:");
	        r1= sc.nextInt();
	        System.out.println("Enter the number of columns:");
	        c1 = sc.nextInt();
	        System.out.println("Enter the number of rows:");
	        r2 = sc.nextInt();
	        System.out.println("Enter the number of columns:");
	        c2 = sc.nextInt();
	        if(r1!=r2||c1!=c2) {
	        	System.out.println("Can't be added");
	        }
	        else {
	        int[][] matrixA = new int[r1][c1];
	        int[][] matrixB = new int[r2][c2];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                matrixA[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("The matrix is:");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c1; j++) {
	                System.out.print(matrixA[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < r2; i++) {
	            for (int j = 0; j < c2; j++) {
	                matrixB[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("The matrix is:");
	        for (int i = 0; i < r2; i++) {
	            for (int j = 0; j < c2; j++) {
	                System.out.print(matrixB[i][j] + " ");
	            }
	            System.out.println();
	        }
	        int[][] matrixC = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            System.out.println("The sum of matrices is:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
	        }
	}
}
	        
	        
	      
	       