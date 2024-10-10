package java10;
import java.util.Scanner;
public class RowMax_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        int r, c, max;
		        System.out.println("Enter the number of rows:");
		        r = sc.nextInt();
		        System.out.println("Enter the number of columns:");
		        c = sc.nextInt();
		        int[][] matrixA = new int[r][c];
		        System.out.println("Enter the elements:");
		        for (int i = 0; i < r; i++) {
		            for (int j = 0; j < c; j++) {
		                matrixA[i][j] = sc.nextInt();
		            }
		        }
		        System.out.println("The matrix is:");
		        for (int i = 0; i < r; i++) {
		            for (int j = 0; j < c; j++) {
		                System.out.print(matrixA[i][j] + " ");
		            }
		            System.out.println();
		        }
		        for (int i = 0; i < r; i++) {
		            max = matrixA[i][0];
		            for (int j = 1; j < c; j++) { 
		                if (matrixA[i][j] > max) {
		                    max = matrixA[i][j];
		                }
		            }
		            System.out.println("Maximum element in Row " + (i + 1) + ": " + max);
		        }
		    }
	}

