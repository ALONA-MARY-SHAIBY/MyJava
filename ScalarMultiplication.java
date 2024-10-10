package java10;
import java.util.Scanner;
public class ScalarMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the no of columns:");
		int c=sc.nextInt();
		int [][] matrix= new int[r][c];
		System.out.println("Enter the elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the scalar value to multiply:");
        int n=sc.nextInt();
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		matrix[i][j]=matrix[i][j]*n;
        	}
        }
        System.out.println("The matrix after mutiplication:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
			}
		}
	

