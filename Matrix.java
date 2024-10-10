package LAB2024;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int Row1 = sc.nextInt();
		System.out.println("Enter no of rows:");
		int Row2 = sc.nextInt();
		System.out.println("Enter no of columns:");
		int Column1 = sc.nextInt();
		System.out.println("Enter no of columns:");
		int Column2 = sc.nextInt();
		int[][] matrix1 = new int[Row1][Column1];
		int[][] matrix2 = new int[Row2][Column2];
		System.out.println("Enter the elements:");
		for(int i=0;i<Row1;i++) {
			for(int j=0;j<Column1;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements:");
		for(int i=0;i<Row2;i++) {
			for(int j=0;j<Column2;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("The elements are:");
		for(int i=0;i<Row1;i++) {
			for(int j=0;j<Column1;j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("The elements are:");
		for(int i=0;i<Row2;i++) {
			for(int j=0;j<Column2;j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println("\n");
		}
		int[][] matrix3 = new int[Row1][Column2];
		if(Row2!=Column1) {
			System.out.println("Not able to multiply");
		}
		else {
			for(int i=0;i<Row1;i++) {
				for(int j=0;j<Column2;j++) {
					for(int k=0;k<Column1;k++) {
						matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
			}
		}
		System.out.println("The elements are:");
		for(int i=0;i<Row1;i++) {
			for(int j=0;j<Column2;j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println("\n");
		}
		
	}
}



